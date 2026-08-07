package co.dingcodingco.week1sample.service;

// 🧪 sample PR placeholder — 도메인 예외
public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(Long id) {
        super("post " + id + " not found");
    }
}
