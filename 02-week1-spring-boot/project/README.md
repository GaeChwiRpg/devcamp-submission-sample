# Week 1 Project — 본인이 처음부터 만드는 첫 Spring Boot 프로젝트

> baseline 없음. 학생이 Spring Initializr에서 새 프로젝트를 만들어 이 폴더 안에 둡니다.

## 시작 가이드

### 1. 프로젝트 생성

[https://start.spring.io](https://start.spring.io)에서 새 프로젝트 생성:

- **Project**: Gradle - Groovy
- **Language**: Java
- **Spring Boot**: 3.3.x (3.3.5 권장)
- **Group**: 본인 그룹 ID (예: `co.dingcodingco.week1`)
- **Artifact**: `week1-board-api`
- **Java**: **21**
- **Dependencies**:
  - Spring Web
  - Spring Data JPA
  - H2 Database (또는 본인 선택 DB)
  - Validation
  - Lombok (선택)

또는 IntelliJ의 Spring Initializr 마법사를 써도 됩니다.

### 2. 폴더 배치

생성된 프로젝트의 파일을 이 `project/` 폴더 안에 통째로 넣습니다.

```
02-week1-spring-boot/project/
├── build.gradle
├── settings.gradle
├── gradlew
├── src/main/java/...
└── src/test/java/...
```

### 3. 부팅 확인

```bash
cd 02-week1-spring-boot/project
./gradlew bootRun
```

8080 포트 바인딩까지 보이면 시작 OK.

## 도메인 (한 가지 권장)

**게시글(Post)** 도메인을 권장합니다. 같은 난이도의 다른 도메인(예: 책, 일정, 메모 등)도 OK이지만 Week 2 JPA에서 Post-Comment 연관관계로 자연스럽게 이어가려면 게시글이 가장 안전합니다.

## 만들어야 하는 것 (4 endpoint)

| Method | URL | 의도 | 예상 status |
| --- | --- | --- | --- |
| POST | /api/posts | 새 게시글 작성 | 201 |
| GET | /api/posts | 목록 조회 | 200 |
| GET | /api/posts/{id} | 단건 조회 | 200 / 404 |
| PUT | /api/posts/{id} | 수정 | 200 / 404 / 400 |

## 3계층 구조 (책 5교시 1장)

```
src/main/java/.../
├── api/post/                  ← Controller (점원)
│   ├── PostController.java
│   ├── PostCreateRequest.java
│   └── PostResponse.java
├── service/                   ← Service (매니저)
│   ├── PostService.java
│   └── PostNotFoundException.java
└── domain/post/               ← Domain + Repository (창고지기)
    ├── Post.java
    └── PostRepository.java
```

상세 책임 경계는 미션 README 평가 기준 참고.
