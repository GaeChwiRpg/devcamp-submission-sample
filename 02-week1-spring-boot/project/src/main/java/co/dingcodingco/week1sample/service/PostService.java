package co.dingcodingco.week1sample.service;

import co.dingcodingco.week1sample.domain.post.Post;
import co.dingcodingco.week1sample.repository.InMemoryPostRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// 🧪 sample PR placeholder — 실제 비즈니스 로직은 학생 본인 구현으로
@Service
public class PostService {

    private final InMemoryPostRepository repository;

    public PostService(InMemoryPostRepository repository) {
        this.repository = repository;
    }

    public List<Post> findAll() {
        // 단일 read — @Transactional 안 붙임
        // TODO 학생 구현
        throw new UnsupportedOperationException("sample placeholder");
    }

    public Post findById(Long id) {
        // 단일 read — @Transactional 안 붙임. 없으면 PostNotFoundException 던짐.
        // TODO 학생 구현
        throw new UnsupportedOperationException("sample placeholder");
    }

    @Transactional
    public Post create(String title, String content, String author) {
        // 저장 + 후행 단계(예: 카운터 증가) 묶임 — 트랜잭션 필요
        // TODO 학생 구현
        throw new UnsupportedOperationException("sample placeholder");
    }

    @Transactional
    public Post update(Long id, String title, String content) {
        // 변경 감지 + 일관성 보장
        // TODO 학생 구현
        throw new UnsupportedOperationException("sample placeholder");
    }
}
