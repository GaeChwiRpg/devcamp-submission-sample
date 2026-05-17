# 02-week1-spring-boot

> 이 미션은 강의 `[Lv1] 면접에서 설명할 수 있는 Spring Boot - 경험으로 답변하는 백엔드 개발`의 적용편입니다.

이번 주는 **HTTP/JSON 기초 → 첫 API → 3계층 분리 → @Transactional → Postman 검증** 흐름을 본인 손으로 한 번 끝까지 돌리는 미션입니다.

## 핵심 학습 포인트 (이번 주 적용 대상)

1. **HTTP 메서드 + 상태 코드**: `POST/GET/PUT/DELETE`, 200/201/400/404 의미
2. **JSON ↔ Java 객체 매핑**: Spring이 자동 변환하는 흐름
3. **3계층 아키텍처**: Controller(점원) / Service(매니저) / Repository(창고지기) 책임 분리
4. **@Transactional + AOP**: "다 주거나 아예 말거나" 원자성
5. **Postman으로 실제 호출**: 응답 JSON과 상태 코드 검증

## 시작 전 환경 셀프체크

본격적으로 코드 작성 들어가기 전에 환경 3가지가 통과되는지 확인합니다.

- JDK 21 설치 확인 (`java -version` → 21.x)
- IntelliJ IDEA에서 Spring 프로젝트 import → Run 성공
- `./gradlew bootRun` → 8080 포트 바인딩 확인

## 이번 주에 해야 하는 것

- **새 Spring Boot 프로젝트 생성** ([Spring Initializr](https://start.spring.io), Java 21, Spring Boot 3.3.x). 시작 가이드는 `project/README.md` 참고.
- **게시글(Post) 도메인** API 4개 endpoint (`POST/GET/GET-by-id/PUT`) 구현
  - Week 2 JPA에서 Post-Comment 연관관계로 자연스럽게 이어가려면 게시글 도메인이 가장 안전합니다.
  - 같은 난이도의 다른 도메인(책/일정/메모 등)도 OK이지만 Week 2 미션 문구도 그에 맞춰 본인이 변환해야 합니다.
- **3계층 분리**: Controller / Service / Repository (각 책임 분리 근거를 evidence에 남김)
- **@Transactional 1개 이상 적용** + 왜 그곳에 붙였는지 근거
- Postman으로 4 endpoint 호출 → 응답 JSON과 상태 코드 캡처
- 서비스 테스트 **3개 이상** (성공/실패/예외 1개씩)
- 팀 규칙 합의 문서 작성

## 이번 주에 제출할 것

- `report.md`
- `evidence/env-jdk-version.txt` — `java -version` 출력 (환경 셀프체크)
- `evidence/intellij-run-and-bootrun-log.md` — IntelliJ Run + `./gradlew bootRun` 로그 (환경 셀프체크)
- `evidence/api-contract.md` — endpoint/메서드/상태코드 정리
- `evidence/response-samples.md` — Postman 호출 성공/실패 응답
- `evidence/test-results.md` — 테스트 3개 이상 실행 결과
- **`evidence/layer-separation-notes.md`** — 3계층 분리 근거
- **`evidence/transactional-snapshot.md`** — @Transactional 적용 위치 + 근거
- `project/` 안 실제 Spring Boot 코드 + 테스트
- (팀) 팀 규칙 합의 문서

## 평가 기준

- 환경 셀프체크 3가지 (JDK 21 / IntelliJ Run / bootRun)가 evidence에 통과 흔적으로 남았는가
- 4 endpoint가 동작하고 Postman 호출 결과가 evidence에 있는가
- Controller/Service/Repository **3계층이 실제로 분리**되어 있고 책임 경계 근거가 있는가
- @Transactional이 **선택의 근거**와 함께 적용되었는가 (단순히 모든 메서드에 붙이지 않음)
- 테스트 3개 이상 + 성공/실패/예외 케이스가 다 보이는가
- 예외 처리가 일관적인가 (`@RestControllerAdvice` 같은 글로벌 처리)

## 미션 시작 전에 보면 좋은 것

1. 이 README의 "이번 주에 해야 하는 것" + "평가 기준"
2. `project/README.md` — Spring Initializr 시작 가이드 + 4 endpoint 표
3. `evidence/README.md` — 어떤 evidence를 남겨야 하는지
4. `report.md` — 시도/판단/결과/회고 템플릿
5. `docs/review-rubric.md`

(정답 PR은 미션 종료 후 운영진이 별도로 공유합니다.)

핵심은 코드를 작성한 사실이 아니라 **3계층과 트랜잭션의 경계를 본인이 설명할 수 있는가**입니다.
