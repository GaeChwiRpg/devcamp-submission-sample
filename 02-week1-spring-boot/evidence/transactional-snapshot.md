# @Transactional 위치 결정 evidence

> 🧪 sample PR 의 placeholder. 학생 본인 제출 시 본인 코드 기반으로 교체하세요.

## 결정 요약

| 메서드 | `@Transactional` | 이유 |
| --- | --- | --- |
| `findAll()` | ❌ | 단일 read — 트랜잭션 cost > benefit |
| `findById(id)` | ❌ | 단일 read |
| `create(title, content, author)` | ✅ (`readOnly=false`) | 저장 + 카운터 증가 묶음 — 부분 실패 시 일관성 깨짐 |
| `update(id, title, content)` | ✅ (`readOnly=false`) | dirty checking 필요 + 변경 감지 |

## 롤백 검증 — 의도된 실패 케이스

`create()` 메서드가 게시글 저장 후 카운터를 증가시키는 시나리오에서, 카운터 증가
단계에서 예외 발생 시 게시글 insert 도 롤백되는지 확인.

```java
// 테스트 시나리오 발췌
@Test
void create_thenCounter_rollsBackOnFailure() {
    // given: 카운터를 항상 실패시키는 mock 주입
    // when: postService.create(...) 호출
    // then: 예외 발생 + 저장된 게시글 0건
    assertThatThrownBy(() -> postService.create("t", "c", "a"))
        .isInstanceOf(CounterFailureException.class);
    assertThat(repository.count()).isEqualTo(0); // 롤백 성공
}
```

## 안티패턴 회피

- ❌ Service 클래스 레벨 `@Transactional` — 모든 메서드에 일괄 적용되면 단일 read 까지 트랜잭션 코스트
- ❌ Controller 레벨 `@Transactional` — 요청 처리 전반을 트랜잭션으로 묶으면 외부 호출 동안 DB 연결 점유
- ✅ Service 메서드 단위로 필요한 곳만 명시적 적용
