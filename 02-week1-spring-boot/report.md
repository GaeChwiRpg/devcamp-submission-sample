---
mission_id: "02-week1-spring-boot"
week: 1
submission_type: "code"
status: "sample"
---

# Week 1 Spring Boot

## 시작 전 환경 셀프체크

- [ ] `java -version` 이 21.x 로 찍힌다
- [ ] IntelliJ에서 Spring 프로젝트 import + Run 성공
- [ ] `./gradlew bootRun` 이 8080 포트 바인딩까지 진행됐다

## 이번 주에 한 것

- [ ] 새 Spring Boot 프로젝트 생성 (Spring Initializr, Java 21, Spring Boot 3.3.x)
- [ ] 게시글(Post) 도메인 API 4 endpoint (POST/GET/GET-by-id/PUT) 구현
- [ ] 3계층 분리 (Controller/Service/Repository) + 책임 경계 근거 evidence
- [ ] @Transactional 1개 이상 적용 + 위치 근거
- [ ] Postman으로 4 endpoint 호출 → 응답 JSON / 상태 코드 캡처
- [ ] 서비스 테스트 3개 이상 (성공/실패/예외 1개씩)
- [ ] 글로벌 예외 처리 (`@RestControllerAdvice` 등)
- [ ] (팀) 팀 채널 고정 메시지에 학습 운영 4 항목 합의 (TIL / 막힘·진행 공유 / 팀 목표 / sync) — 레포 제출 X

## 제출 파일

- [ ] `evidence/env-jdk-version.txt`
- [ ] `evidence/intellij-run-and-bootrun-log.md`
- [ ] `evidence/api-contract.md`
- [ ] `evidence/response-samples.md`
- [ ] `evidence/test-results.md`
- [ ] `evidence/layer-separation-notes.md`
- [ ] `evidence/transactional-snapshot.md`
- [ ] `project/` 안 실제 Spring Boot 코드 + 테스트

## 배운 점 / 막혔던 점

- 3계층 경계가 가장 명확했던 메서드 + 왜
- @Transactional 위치 결정에서 가장 고민했던 지점
- 테스트 3개 중 가장 작성하기 어려웠던 케이스 + 왜
- Week 2 JPA 전환 때 가장 영향 받을 부분
