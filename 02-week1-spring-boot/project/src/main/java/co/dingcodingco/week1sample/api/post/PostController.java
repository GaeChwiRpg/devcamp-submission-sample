package co.dingcodingco.week1sample.api.post;

import co.dingcodingco.week1sample.service.PostService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

// 🧪 sample PR placeholder — 실제 메서드 본문은 학생 본인 구현으로 교체
@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PostResponse create(@Valid @RequestBody PostCreateRequest request) {
        // TODO 학생 구현: postService.create(...) 호출 + PostResponse 매핑
        throw new UnsupportedOperationException("sample placeholder");
    }

    @GetMapping
    public List<PostResponse> findAll() {
        // TODO 학생 구현
        throw new UnsupportedOperationException("sample placeholder");
    }

    @GetMapping("/{postId}")
    public PostResponse findById(@PathVariable Long postId) {
        // TODO 학생 구현
        throw new UnsupportedOperationException("sample placeholder");
    }

    @PutMapping("/{postId}")
    public PostResponse update(@PathVariable Long postId, @Valid @RequestBody PostUpdateRequest request) {
        // TODO 학생 구현
        throw new UnsupportedOperationException("sample placeholder");
    }
}
