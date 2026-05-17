# 07-week6-profiling

## 이번 주에 해야 하는 것

- 느린 구간을 프로파일링합니다.
- 병목 우선순위를 정합니다.
- 개선 전후 수치를 비교합니다.

## 이번 주에 제출할 것

- `report.md`
- `evidence/profiling-report.md`
- `evidence/improvement-priority.md`
- `evidence/before-after-table.md`
- `project/` 안 실제 코드

## 이 샘플에서 먼저 볼 것

1. `project/README.md` — baseline + 미션 흐름
2. `project/MEASUREMENT-OPTIONS.md` — 부하 발생기 + 프로파일러 후보 메뉴 (각 1택)
3. `report.md` 템플릿
4. `evidence/README.md` 템플릿
5. PR diff에서 프로파일링 결과와 개선 우선순위 예시

`project/` 안에 baseline 코드와 Actuator metrics 활성 환경이 이미 들어 있어 환경 세팅 없이 부하/프로파일링에 바로 들어갈 수 있습니다.

핵심은 **"느렸다"가 아니라, 어디가 느렸고 무엇을 먼저 고쳐야 하는지 우선순위를 남기는 것**입니다.
