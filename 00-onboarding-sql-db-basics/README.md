# 00-onboarding-sql-db-basics

> 교재: `books/00-onboarding-sql-db-basics.md` (1~10장 SQL/DB 기초)

이번 주는 책의 **DB 기초 → CRUD → 제약조건 → 연관관계 → JOIN/GROUP BY → 트랜잭션 → 인덱스** 흐름을 본인 손으로 한 번 끝까지 돌리는 미션입니다.

## 책의 핵심 학습 포인트

- DB 기초 개념: 테이블/레코드/키 (책 1·3장)
- CRUD: INSERT/SELECT/UPDATE/DELETE/ALTER (책 4·5장)
- 제약조건: NOT NULL / DEFAULT / UNIQUE / FOREIGN KEY (책 5장)
- 연관관계와 JOIN (책 6장)
- DISTINCT / AGGREGATE / GROUP BY / ORDER BY / LIMIT / Sub Query (책 7장)
- 트랜잭션 ACID (책 8장)
- 인덱스 + EXPLAIN (책 9장 — Week 4와 다시 연결)

## 이번 주에 해야 하는 것

- Todo 테이블 설계 + 제약조건 + 인덱스
- CRUD SQL 직접 작성 (INSERT/SELECT/UPDATE/DELETE)
- 프로그래머스 SQL 문제 2개 풀이:
  - **Q1.** [평균 일일 대여 요금 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/151136) (SELECT 유형)
  - **Q2.** [재구매가 일어난 상품과 회원 리스트 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/131536) (GROUP BY 유형)
  - 프로그래머스에서 정답 처리된 쿼리를 복붙해 evidence 파일로 남깁니다.

## 이번 주에 제출할 것

- `report.md`
- `evidence/todo-schema.sql` — Todo 테이블 스키마 + 제약조건 + 인덱스
- `evidence/todo-crud.sql` — INSERT/SELECT/UPDATE/DELETE 예시
- `evidence/programmers-q1-rental-fee.sql` — Q1 답안 ([문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/151136))
- `evidence/programmers-q2-repurchase.sql` — Q2 답안 ([문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/131536))

## 평가 기준

- Todo 스키마에 제약조건이 명시되었는가 (NOT NULL, DEFAULT, INDEX)
- CRUD SQL 4가지 모두 보이는가
- 프로그래머스 답안 2개가 본인 풀이인가 (그대로 복붙은 미통과)

## 이 샘플에서 먼저 볼 것

1. `report.md`
2. SQL 답안 파일 4개

핵심은 결과 캡처보다 **실제 SQL 답안을 파일로 남기는 것**입니다.
