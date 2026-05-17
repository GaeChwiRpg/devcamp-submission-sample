# 06-week5-concurrency

## 이번 주에 해야 하는 것

- 경쟁 상태를 재현합니다.
- 락 전략 하나를 골라 적용합니다.
- 실패 로그와 성공 로그를 같이 남깁니다.

## 이번 주에 제출할 것

- `report.md`
- `evidence/concurrency-failure-log.md`
- `evidence/concurrency-success-log.md`
- `evidence/lock-strategy-comparison.md`
- `project/` 안 실제 코드

## 이 샘플에서 먼저 볼 것

1. `project/README.md` — baseline + 미션 흐름
2. `project/MEASUREMENT-OPTIONS.md` — 동시 요청 발생기 후보 메뉴 (1택)
3. `report.md` 템플릿
4. `evidence/README.md` 템플릿
5. PR diff에서 실패/성공 로그 예시

`project/` 안에 baseline 코드가 이미 들어 있고, `decreaseStock`/`OrderService.create`가 동시성 재현 포인트입니다. 학생은 그 위에서 동시성 미션만 다룹니다.

핵심은 **락 이름을 외우는 게 아니라, 어떤 버그를 어떻게 재현하고 막았는지 설명하는 것**입니다.
