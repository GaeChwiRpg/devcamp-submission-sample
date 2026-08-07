# 3계층 분리 의사결정 노트

> 🧪 sample PR 의 placeholder. 학생 본인 제출 시 본인이 내린 판단으로 교체하세요.

## 책 5교시 1장 비유 적용

| 계층 | 비유 | 책임 | 본 PR 의 구현 |
| --- | --- | --- | --- |
| Controller | 점원 | 입출력 (요청 검증·응답 매핑) | `api/post/PostController.java` |
| Service | 매니저 | 비즈니스 흐름·도메인 규칙 | `service/PostService.java` |
| Repository | 창고지기 | 영속화·조회 | `repository/InMemoryPostRepository.java` |

## 의사결정 1: Controller 에서 도메인 객체 직접 반환 X

- 의도: 도메인 객체(`Post`)와 응답 DTO(`PostResponse`) 분리
- 이유: Controller 가 도메인 내부 필드 직접 노출하면 API 가 도메인 변경에 묶임
- 적용: `PostResponse.from(post)` 로 매 응답 시 명시적 매핑

## 의사결정 2: Service 가 Repository 인터페이스만 의존

- 의도: Week 2 JPA 전환 시 Service 코드 변경 없이 Repository 구현체만 갈아끼우기
- 이유: 책 5교시 1장 "재사용성" — 구현체 의존 X, 추상화 의존 O
- 적용: `PostRepository` 인터페이스 + `InMemoryPostRepository` 구현체

## 의사결정 3: 예외는 도메인에서 던지고 Controller 가 받지 않음

- 의도: 도메인 예외(`PostNotFoundException`)는 service 에서 던지고, `@RestControllerAdvice` 가 일괄 변환
- 이유: Controller 가 try-catch 로 분기하면 각 endpoint 가 똑같은 로직 반복
- 적용: `api/common/GlobalExceptionHandler.java` 1곳에서 도메인 예외 → HTTP 상태/응답 본문 매핑

## 안 한 것 (Week 1 범위 밖)

- 인증/인가
- 영속화 (Week 2 JPA 로 전환 예정)
- 분산 트랜잭션
- 캐싱 (Week 7)
