---
mission_id: "05-week4-index"
week: 4
submission_type: "code"
status: "sample"
---

# Week 4 Index

## 이번 주에 한 것

- [ ] baseline 의 _느린 조회 API 1개_ 선택 (어떤 endpoint·왜 그것을 골랐는지)
- [ ] 시드 데이터 행 수 확인 (풀스캔이 의미 있는 규모인지)
- [ ] 인덱스 _없는_ 상태에서 EXPLAIN + latency 측정
- [ ] 인덱스 추가 (`CREATE INDEX idx_xxx ON ...`) — 컬럼 선택 근거
- [ ] 인덱스 _있는_ 상태에서 같은 쿼리·같은 데이터로 재측정
- [ ] before / after 비교표 작성 (`rows` 변화 + latency 변화)
- [ ] 측정 도구 선택 근거 evidence

## 제출 파일

- [ ] `evidence/explain-before.md`
- [ ] `evidence/explain-after.md`
- [ ] `evidence/latency-comparison.md`
- [ ] (선택) `evidence/index-decision-notes.md`
- [ ] `project/src/main/java/...` — 쿼리 + 인덱스 마이그레이션 변경
- [ ] `project/src/main/resources/...` — schema 변경 (있다면)

## 배운 점 / 막혔던 점

- EXPLAIN 3 컬럼 (`type` / `key` / `rows`) 중 가장 직관적이었던 한 가지 + 이유
- 인덱스 컬럼 선택에서 가장 고민한 지점 (단일 vs 복합 / 카디널리티)
- 인덱스가 안 타는 함정 (가공/LIKE/OR/카디널리티 등) 중 본인 코드에서 직접 만난 사례
- 측정 도구 선택 — 왜 그 도구이고 다음 주차 부하 측정에 어떻게 적용할지
- Week 3 이력서 bullet 으로 변환 시 가장 강조하고 싶은 결정 (수치)
