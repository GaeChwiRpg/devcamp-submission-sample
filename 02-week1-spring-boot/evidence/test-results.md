# 테스트 결과 — Week 1 Spring Boot

> 🧪 sample PR 의 placeholder. 학생 본인 제출 시 실제 테스트 실행 결과로 교체하세요.

## 실행 환경

- JDK 21
- Gradle 8.x
- Spring Boot 3.x
- 명령: `./gradlew test`

## 결과 요약

```
> Task :test

PostServiceTest > create_succeeds() PASSED
PostServiceTest > findById_throwsWhenMissing() PASSED
PostServiceTest > update_validationError_propagatesAsBadRequest() PASSED

3 tests completed, 0 failed
BUILD SUCCESSFUL in 4s
```

## 케이스별 의미

| 테스트 | 시나리오 | 검증 포인트 |
| --- | --- | --- |
| `create_succeeds` | 정상 입력 → 저장 → id 반환 | Service ↔ Repository 분리, save 후 id 채워짐 |
| `findById_throwsWhenMissing` | 없는 id 조회 | `PostNotFoundException` 정확히 던져짐 |
| `update_validationError_propagatesAsBadRequest` | 빈 title 로 update | Controller layer 의 `@Valid` 가 400 으로 매핑 |

## 트랜잭션 검증 1건

- `PostServiceTest > create_thenCounter_rollsBackOnFailure()` 1건 추가 실행 (별도 evidence/transactional-snapshot.md 참고)
- `@Transactional` 가 묶인 메서드에서 후행 단계 실패 시 선행 insert 도 롤백되는지 확인
