# Dev Camp Submission Sample

> 학생용 제출 샘플 레포 · 모집 마감 2026-05-16 · 정규 시작 2026-05-30

이 저장소는 학생이
"이번 주 미션은 뭘 해야 하고, 어떤 파일을 제출해야 하나요?"
를 바로 이해하도록 만든 샘플 레포입니다.

처음이라면 5분 안에 다음 순서로 보세요:

1. 이 README의 "이 레포를 보는 법" 섹션
2. `00-onboarding-sql-db-basics/README.md`
3. 본인이 해당 주차 책의 챕터를 읽고 본인 풀이로 시작
4. `docs/review-rubric.md` (AI 리뷰가 무엇을 보는지)

## 이 레포를 보는 법

- `main` 브랜치 = 제출 **골격**
  - 각 주차 폴더의 `README.md`, `report.md`, `evidence/README.md`, `project/README.md`(있다면)를 보고 이번 주 제출 형식을 이해합니다.
  - Week 4~7은 `project/`에 baseline 코드와 `MEASUREMENT-OPTIONS.md`(측정 도구 후보 메뉴)도 함께 들어 있습니다.
- 학생은 **본인 미션 진행 중에는 정답 PR을 보지 않는 것이 학습 효과 큽니다.**
- 정답 PR은 미션 종료 후 운영진이 별도로 공유합니다(아래 "정답 PR 정책" 참고).

## 제출의 기본 규칙

- 한 미션 = 한 PR
- 한 PR에는 한 미션 폴더만 수정
- 브랜치 이름은 `submit/<mission-id>`
- 문서형 미션도 `report.md`와 `evidence/`는 반드시 작성
- 코드형 미션은 해당 미션 폴더의 `project/` 안에서만 구현
- PR 본문 형식은 `.github/PULL_REQUEST_TEMPLATE.md`(자동 채워짐)를 그대로 따른다

## 학생이 이해해야 하는 폴더 3개

- `report.md`
  - 제출 리포트입니다.
  - 이번 주에 무엇을 했고, 왜 그렇게 했는지 적습니다.
- `evidence/`
  - 증빙 폴더입니다.
  - 리포트에서 말한 내용을 실제 파일로 증명합니다.
- `project/`
  - 코드형 미션에서 실제 코드가 들어가는 폴더입니다.
  - Week 4~7은 baseline 코드가 미리 들어 있어서 환경 세팅 없이 바로 미션 시작 가능합니다.

한 줄로 요약하면:

- `report.md` = 설명
- `evidence/` = 증거
- `project/` = 실제 코드

## 이번 주 미션 찾는 법

- `00-onboarding-sql-db-basics/`
- `01-onboarding-git-basics/`
- `02-week1-spring-boot/`
- `03-week2-jpa/`
- `04-week3-backend-resume/`
- `05-week4-index/`
- `06-week5-concurrency/`
- `07-week6-profiling/`
- `08-week7-redis/`
- `09-week8-ai-native/`
- `10-week10-interview/`

각 폴더의 `README.md`에는 아래 세 가지가 고정으로 들어 있습니다.

- 이번 주에 해야 하는 것 (책 어떤 챕터를 학습 → 무엇을 적용)
- 이번 주에 제출할 것
- 평가 기준

## 정답 PR 정책

이 레포는 **제출 골격만** 공개합니다. 정답 PR(미션의 한 가지 풀이 예시)은 다음 운영 흐름으로 공유됩니다.

1. 학생은 책 + 미션 README + 본인 사고로 풀이를 작성
2. 정해진 시점에 PR 제출
3. 미션 마감 후 운영진이 그 주차의 **정답 PR 링크**를 Discord/메일로 공유
4. 학생은 본인 풀이와 비교 학습

정답을 미리 보면 본인 사고와 측정 학습이 사라지므로 의도적으로 비공개로 운영합니다.

## Week 9 팀 프로젝트

Week 9는 개인 제출 폴더가 아니라 팀 프로젝트 PR 제출입니다.

- repo: https://github.com/GaeChwiRpg/devcamp-team-submission-sample

## PR 본문 형식

PR을 열면 `.github/PULL_REQUEST_TEMPLATE.md`가 자동으로 채워집니다.
본문 표준은 그 파일이 단일 진실(SoT)이며, 다른 문서는 그 파일을 참조만 합니다.

요약하면:

- What Changed 2~3줄
- Evidence 1~2줄
- 자동 체크리스트 4~5개

시스템은 브랜치명(`submit/<mission-id>`)과 변경 파일 경로로 미션을 식별하므로, 본문 메타데이터를 외워서 적을 필요가 없습니다.
