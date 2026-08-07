package co.dingcodingco.week1sample.domain.post;

import java.time.Instant;

// 🧪 sample PR placeholder — id 생성 전략은 학생 본인 구현으로
public class Post {
    private Long id;
    private String title;
    private String content;
    private String author;
    private Instant createdAt;

    public Post(Long id, String title, String content, String author, Instant createdAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdAt = createdAt;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getAuthor() { return author; }
    public Instant getCreatedAt() { return createdAt; }

    public void updateTitle(String title) { this.title = title; }
    public void updateContent(String content) { this.content = content; }
}
