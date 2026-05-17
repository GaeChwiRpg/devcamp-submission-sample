---
mission_id: "03-week2-jpa"
week: 2
submission_type: "code"
status: "sample"
---

# Week 2 JPA

## 이번 주에 한 것

- [ ] Week 1 코드를 JPA로 리팩토링
- [ ] Post + Comment 연관관계 추가 (`@ManyToOne` + `@OneToMany`)
- [ ] 모든 연관관계 LAZY 기본
- [ ] N+1 또는 fetch join 차이를 쿼리 로그로 설명
- [ ] 변경 감지(Dirty Checking)로 update 메서드 1건 작성 (save() 호출 없이)

## 제출 파일

- [ ] `evidence/entity-design-notes.md`
- [ ] `evidence/association-owner-decision.md`
- [ ] `evidence/n-plus-one-before.md`
- [ ] `evidence/n-plus-one-after.md`
- [ ] `evidence/dirty-checking-snapshot.md`
- [ ] `project/src/main/java/...`

## 책의 5가지 핵심 학습 포인트 매핑

- 영속성 컨텍스트 4 기능 → 변경 감지 evidence
- @Entity/@Table/@Id 전략 → 엔티티 설계 evidence
- 연관관계 주인 → 주인 결정 evidence
- LAZY 기본 + N+1 → before/after 쿼리 로그 evidence
- 학습 보조 `n1-detection-guide.md`

## 배운 점

- 책의 5 핵심 중 가장 학습 효과 컸던 것 + 왜
- 다음 주차(Week 3 이력서) 이력서 문장으로 변환 시 가장 강조하고 싶은 결정
