package co.dingcodingco.week1sample.api.post;

import co.dingcodingco.week1sample.domain.post.Post;
import java.time.Instant;

// 🧪 sample PR placeholder — 응답 DTO 형식 예시
public record PostResponse(
    Long id,
    String title,
    String content,
    String author,
    Instant createdAt
) {
    public static PostResponse from(Post post) {
        return new PostResponse(
            post.getId(),
            post.getTitle(),
            post.getContent(),
            post.getAuthor(),
            post.getCreatedAt()
        );
    }
}
