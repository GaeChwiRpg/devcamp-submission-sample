package co.dingcodingco.week1sample.repository;

import co.dingcodingco.week1sample.domain.post.Post;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

// 🧪 sample PR placeholder — Week 1 은 메모리 저장. Week 2 JPA 로 전환.
@Repository
public class InMemoryPostRepository {

    public Post save(Post post) {
        // TODO 학생 구현: id 생성·할당·저장
        throw new UnsupportedOperationException("sample placeholder");
    }

    public Optional<Post> findById(Long id) {
        // TODO 학생 구현
        throw new UnsupportedOperationException("sample placeholder");
    }

    public List<Post> findAll() {
        // TODO 학생 구현
        throw new UnsupportedOperationException("sample placeholder");
    }

    public long count() {
        // TODO 학생 구현
        throw new UnsupportedOperationException("sample placeholder");
    }
}
