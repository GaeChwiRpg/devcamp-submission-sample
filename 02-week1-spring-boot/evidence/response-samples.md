# Postman 응답 캡처 — 게시판 API

> 🧪 sample PR 의 placeholder. 학생 본인 제출 시 실제 호출 결과로 교체하세요.

## 1. POST /api/posts — 201 Created

**Request**

```json
{
  "title": "Hello",
  "content": "First post",
  "author": "dingco"
}
```

**Response (200ms)**

```json
{
  "id": 1,
  "title": "Hello",
  "content": "First post",
  "author": "dingco",
  "createdAt": "2026-01-01T00:00:00Z"
}
```

## 2. GET /api/posts — 200 OK (목록 3건)

```json
[
  { "id": 1, "title": "Hello", "author": "dingco" },
  { "id": 2, "title": "Two", "author": "alice" },
  { "id": 3, "title": "Three", "author": "bob" }
]
```

## 3. GET /api/posts/1 — 200 OK

```json
{ "id": 1, "title": "Hello", "content": "First post", "author": "dingco" }
```

## 4. GET /api/posts/9999 — 404 Not Found (의도된 실패)

```json
{ "error": "POST_NOT_FOUND", "message": "post 9999 not found" }
```

## 5. PUT /api/posts/1 — 200 OK

```json
{ "id": 1, "title": "Hello (edited)", "content": "First post v2", "author": "dingco" }
```

## 검증 결과 요약

| Method | URL | 기대 status | 실제 status | OK |
| --- | --- | --- | --- | --- |
| POST | /api/posts | 201 | 201 | ✅ |
| GET | /api/posts | 200 | 200 | ✅ |
| GET | /api/posts/1 | 200 | 200 | ✅ |
| GET | /api/posts/9999 | 404 | 404 | ✅ (의도된 실패) |
| PUT | /api/posts/1 | 200 | 200 | ✅ |
