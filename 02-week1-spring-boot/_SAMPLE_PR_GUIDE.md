# 📌 Sample Submission PR — Week 1 Spring Boot

이 PR 은 **Week 1 미션 제출 형식 참고용 샘플**입니다. 학생 본인 제출 시 다음을
그대로 참고하세요.

## 제출 PR 의 표준 형태

- **브랜치**: `submit/02-week1-spring-boot`
- **변경 범위**: `missions/02-week1-spring-boot/**` 만 허용 (다른 경로 X)
- **PR 본문 필수 메타데이터** (review bot 이 파싱):
  - `mission_id: 02-week1-spring-boot`
  - `week: 1`
  - `submission_type: code`
  - `submission_path: missions/02-week1-spring-boot`

## 폴더 구조 (이 PR 의 diff 에서 그대로 확인)

```
02-week1-spring-boot/
├── report.md          ← 본문 + 회고 (frontmatter 메타데이터 포함)
├── evidence/          ← 수치·로그·스크린샷 evidence
│   ├── api-contract.md
│   ├── response-samples.md
│   ├── test-results.md
│   ├── layer-separation-notes.md
│   └── transactional-snapshot.md
└── project/           ← 구현 코드 (Spring Boot)
    └── README.md
```

## report.md 구조 (4-section 추천)

`시도 / 판단 / 결과 / 회고` — 본인이 무엇을 했고, 왜 그렇게 결정했고,
어떻게 됐고, 다음에 뭐가 다를지를 분명하게.
