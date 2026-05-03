---
mission_id: "02-week1-spring-boot"
week: 1
submission_type: "code"
status: "sample"
---

# Week 1 Spring Boot

## 시도

- 게시글 API 4 endpoint 구현 (POST/GET/GET-by-id/PUT)
- 3계층 분리 (Controller/Service/Repository) 책 5교시 1장 적용
- @Transactional 적용 위치 결정 (책 5교시 3·4·5장)
- Postman으로 4 endpoint 호출 결과 캡처
- 서비스 테스트 3개 (성공/실패/예외 1개씩)

## 판단

- 3계층 분리: 책의 "점원/매니저/창고지기" 비유를 그대로 적용. 점원(Controller)은 입출력만, 매니저(Service)는 비즈니스 흐름, 창고지기(Repository)는 저장만.
- @Transactional 위치: 단일 read는 안 붙임 (cost > benefit), 여러 단계 read+write가 묶이는 메서드(예: 게시글 생성 + 카운터 증가)에만 붙임.
- 예외 처리: 글로벌 `@RestControllerAdvice` 1개로 통일. 도메인 예외 별 상태코드 매핑.

## 결과

- 4 endpoint 모두 Postman 정상 호출 (응답 캡처 `evidence/response-samples.md`)
- 테스트 3개 통과 (success / not-found / validation-error)
- @Transactional 위치 결정 근거 evidence 완료

## 회고

- 책의 비유(점원/매니저/창고지기)가 책임 경계를 처음 설명할 때 가장 명확
- @Transactional을 "모든 메서드에 붙이는" 흔한 안티패턴을 미리 피한 게 다음 주 JPA에서 큰 도움이 될 것
- Week 2 JPA 전환 시 Repository 인터페이스만 바꾸면 Service 변경 없이 갈 수 있게 설계 (책 5교시 1장 "재사용성")

## 제출 파일

- `evidence/api-contract.md`
- `evidence/response-samples.md`
- `evidence/test-results.md`
- `evidence/layer-separation-notes.md`
- `evidence/transactional-snapshot.md`
- `project/src/main/java/...`
- `project/src/test/java/...`
