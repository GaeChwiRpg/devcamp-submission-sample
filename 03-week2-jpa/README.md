# 03-week2-jpa

> 교재: `books/03-week2-lv2-jpa.md` (특히 영속성 컨텍스트 + 연관관계 주인 + LAZY/N+1)

이번 주는 책의 **영속성 컨텍스트 4 기능 → 연관관계 주인 결정 → LAZY 기본 + N+1 인식**을 본인 코드에서 한 번 손에 익히는 미션입니다.

## 책의 핵심 학습 포인트 (이번 주 적용 대상)

1. **영속성 컨텍스트 4 기능** (책 1교시): 1차 캐시 / 동일성 보장 / 변경 감지 / 쓰기 지연
2. **엔티티 매핑** (책 2교시 1·2장): @Entity, @Table, @Id 전략(IDENTITY vs SEQUENCE)
3. **연관관계 주인** (책 3교시 2·3장): "외래 키를 가진 쪽이 주인" 원칙 + 양방향 편의 메서드
4. **LAZY/EAGER + N+1** (책 3교시 5·6장): LAZY 기본, N+1 신호, fetch join / @EntityGraph 해결책
5. **변경 감지** (책 1교시 7장): "update 메서드를 찾지 마세요" — Dirty Checking

## 이번 주에 해야 하는 것

- Week 1 코드를 JPA 기반으로 리팩토링 (Week 1 베이스를 그대로 이어감)
- Post + Comment 연관관계 추가 (`@ManyToOne` + `@OneToMany`)
- **연관관계 주인을 본인이 결정**하고 그 근거 evidence
- 모든 연관관계는 **LAZY 기본** (책 3교시 5장)
- **N+1 또는 fetch join 차이를 쿼리 로그로 설명** (Week 2 게이트 — 꼭 N+1 잡아내지 못해도 fetch join/@EntityGraph 적용 전후 SQL 차이 설명이면 통과)
- **변경 감지 활용 1건** (수정 메서드에서 setter 후 save() 안 부르고 트랜잭션 종료로 flush)

## 이번 주에 제출할 것

- `report.md`
- `evidence/entity-design-notes.md` — Post/Comment 엔티티 설계 + ID 전략 결정
- `evidence/association-owner-decision.md` — 연관관계 주인 결정 근거 (책 3교시 2·3장)
- `evidence/n-plus-one-before.md` — Hibernate `show_sql` 출력에서 N+1 패턴 또는 베이스라인 쿼리
- `evidence/n-plus-one-after.md` — fetch join / `@EntityGraph` 적용 후 쿼리
- `evidence/dirty-checking-snapshot.md` — 변경 감지 활용 사례 (책 1교시 7장)
- `evidence/n1-detection-guide.md` — 학습 보조 (main에서 함께 들어감, 답안 X)
- `project/` 안 실제 JPA 코드

## 평가 기준

- Post/Comment 엔티티가 책의 매핑 원칙(@Entity, @Table, @Id 전략 결정 근거)을 따르는가
- 연관관계 주인이 **본인 결정 근거와 함께** 명확한가 (책 3교시 2·3장 적용)
- 모든 `@ManyToOne`/`@OneToMany`가 **LAZY 기본**인가
- 본인 언어로 N+1 신호 → 해결의 흐름을 설명할 수 있는가
- 변경 감지를 사용한 update 메서드가 1개 이상 있는가 (save() 호출 없이)

## 이 샘플에서 먼저 볼 것

1. `evidence/n1-detection-guide.md` — `show_sql` 켜는 법, N+1 신호 패턴
2. `evidence/association-owner-decision.md` — 주인 결정 근거
3. `evidence/dirty-checking-snapshot.md` — 변경 감지 적용
4. `report.md`
5. PR diff에서 `Post`/`Comment` 연관관계 + LAZY 기본 + N+1 전후 쿼리

핵심은 "JPA로 바꿨다"가 아니라, **영속성 컨텍스트 + 연관관계 + LAZY 세 축을 본인이 설명할 수 있는가**입니다.
