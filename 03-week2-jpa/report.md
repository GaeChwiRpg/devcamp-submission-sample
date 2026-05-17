---
mission_id: "03-week2-jpa"
week: 2
submission_type: "code"
status: "sample"
---

# Week 2 JPA

## 이번 주에 한 것

- [ ] Week 1 코드를 본 폴더로 복사 + JPA 기반으로 리팩토링 (메모리 저장소 → `JpaRepository`)
- [ ] Post + Comment 연관관계 추가 (`@ManyToOne` + `@OneToMany`)
- [ ] 연관관계 주인 결정 + 근거 evidence
- [ ] 모든 연관관계 LAZY 기본
- [ ] N+1 또는 fetch join 차이를 쿼리 로그로 설명 (before/after)
- [ ] 변경 감지(Dirty Checking)로 update 메서드 1건 작성 (save() 호출 없이)

## 제출 파일

- [ ] `evidence/entity-design-notes.md`
- [ ] `evidence/association-owner-decision.md`
- [ ] `evidence/n-plus-one-before.md`
- [ ] `evidence/n-plus-one-after.md`
- [ ] `evidence/dirty-checking-snapshot.md`
- [ ] `project/` 안 실제 JPA 코드

## 배운 점 / 막혔던 점

- 영속성 컨텍스트 4 기능 중 본인 코드에서 가장 강하게 체감한 것 + 왜
- 연관관계 주인 결정에서 가장 고민했던 지점
- N+1 신호를 처음 알아챈 순간 (또는 fetch join 적용 전후 SQL 차이)
- Week 3 이력서 bullet 으로 변환 시 가장 강조하고 싶은 결정
