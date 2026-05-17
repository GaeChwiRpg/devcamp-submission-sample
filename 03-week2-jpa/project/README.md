# Week 2 Project — Week 1 코드를 JPA로 리팩토링

> Week 1 `02-week1-spring-boot/project/` 코드를 이 폴더로 복사해서 시작합니다.

## 시작 가이드

### 1. Week 1 코드 복사

```bash
# 본인 레포 루트에서
cp -r 02-week1-spring-boot/project/. 03-week2-jpa/project/
```

또는 GitHub에서 본인 Week 1 PR이 머지된 main의 `02-week1-spring-boot/project/` 내용을 그대로 복사해서 옮깁니다.

### 2. JPA 의존성 확인

`build.gradle`에 다음이 있어야 합니다 (Week 1에 추가했으면 그대로):

```groovy
implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
runtimeOnly 'com.h2database:h2'
```

### 3. application.yml에 SQL 로그 켜기

Week 2 N+1 미션 핵심. `src/main/resources/application.yml`:

```yaml
spring:
  jpa:
    properties:
      hibernate:
        show_sql: true
        format_sql: true
logging:
  level:
    org.hibernate.SQL: DEBUG
```

운영 환경에선 끄지만 학습 한정으로 켭니다.

## 만들어야 하는 것

### 1. Post를 JPA 엔티티로 변환

- `@Entity`, `@Table`, `@Id` + `@GeneratedValue(strategy = IDENTITY)`
- 기존 메모리 저장소 대신 `JpaRepository<Post, Long>` 사용

### 2. Comment 엔티티 + 연관관계 추가

- `Comment` 엔티티 새로 추가
- Post 1:N Comment 양방향 연관관계
- 외래 키는 Comment 측 (연관관계 주인)
- 모든 연관관계 **LAZY 기본**

### 3. 게시글 + 댓글 목록 조회 API 추가

- `GET /api/posts/{id}/with-comments`
- 이 endpoint에서 N+1 신호 발견 → fetch join 또는 `@EntityGraph` 적용
- before/after 쿼리 로그를 evidence에 남김

### 4. 변경 감지 활용 update 메서드 1개

- `PostService.update`에서 `findById` 후 도메인 메서드 호출만으로 UPDATE 발행
- `save()` 호출 X

상세 흐름은 미션 README + `evidence/n1-detection-guide.md` 참고.
