# 08-week7-redis

## 이번 주에 해야 하는 것

- 캐시를 붙일 API를 고릅니다.
- 캐시 키 기준을 정합니다.
- 캐시 적용 전후 DB 부하 차이를 비교합니다.

## 이번 주에 제출할 것

- `report.md`
- `evidence/cache-key-notes.md`
- `evidence/hit-rate-report.md`
- `evidence/db-load-comparison.md`
- `project/` 안 실제 코드

## 이 샘플에서 먼저 볼 것

1. `project/README.md` — baseline + 미션 흐름
2. `project/MEASUREMENT-OPTIONS.md` — hit rate 측정 + DB 부하 비교 후보 메뉴 (각 1택)
3. `report.md` 템플릿
4. `evidence/README.md` 템플릿
5. PR diff에서 캐시 키 / 히트율 / DB 부하 비교 예시

`project/` 안에 baseline + `@EnableCaching` 활성 환경이 이미 들어 있어 캐시 미션에 바로 들어갈 수 있습니다.

핵심은 **Redis를 썼다는 사실보다, 어디에 왜 붙였고 무엇이 줄었는지 비교하는 것**입니다.
