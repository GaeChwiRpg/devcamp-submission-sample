# API Contract — 게시판 API

> 🧪 이 파일은 sample PR 의 placeholder 입니다. 학생 본인 제출 시 실제 값으로 교체하세요.

## 엔드포인트 요약

| Method | URL | 설명 | 인증 |
| --- | --- | --- | --- |
| POST | `/api/posts` | 게시글 생성 | 없음 (Week 1 범위) |
| GET | `/api/posts` | 전체 목록 조회 | 없음 |
| GET | `/api/posts/{postId}` | 단건 조회 | 없음 |
| PUT | `/api/posts/{postId}` | 게시글 수정 | 없음 |

## 1. 게시글 생성

**요청**

```http
POST /api/posts
Content-Type: application/json

{
  "title": "제목 예시",
  "content": "본문 예시",
  "author": "작성자 예시"
}
```

**응답 — 201 Created**

```json
{
  "id": 1,
  "title": "제목 예시",
  "content": "본문 예시",
  "author": "작성자 예시",
  "createdAt": "2026-01-01T00:00:00Z"
}
```

**검증 실패 — 400 Bad Request**

```json
{
  "error": "VALIDATION_FAILED",
  "fields": {
    "title": "필수 필드입니다"
  }
}
```

## 2. 단건 조회

`GET /api/posts/{postId}` — 200 / 404 (`POST_NOT_FOUND`)

## 3. 수정

`PUT /api/posts/{postId}` — 200 / 404 / 400

## 상태 코드 매핑 (도메인 예외)

| 예외 | 상태 코드 | 응답 `error` 필드 |
| --- | --- | --- |
| `PostNotFoundException` | 404 | `POST_NOT_FOUND` |
| `MethodArgumentNotValidException` | 400 | `VALIDATION_FAILED` |
| `Exception` (catchall) | 500 | `INTERNAL_ERROR` |
