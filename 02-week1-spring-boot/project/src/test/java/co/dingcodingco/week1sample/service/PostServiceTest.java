package co.dingcodingco.week1sample.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

// 🧪 sample PR placeholder — 실제 테스트 케이스는 학생 본인 구현으로 교체
class PostServiceTest {

    @Test
    void create_succeeds() {
        // given: 유효한 입력
        // when: postService.create(...)
        // then: 반환된 Post 의 id != null, repository.count() == 1
        // TODO 학생 구현
    }

    @Test
    void findById_throwsWhenMissing() {
        // given: 빈 repository
        // when/then: postService.findById(9999L) → PostNotFoundException
        // TODO 학생 구현
        assertThatThrownBy(() -> { /* postService.findById(9999L) */ })
            .isInstanceOf(PostNotFoundException.class);
    }

    @Test
    void update_validationError_propagatesAsBadRequest() {
        // given: 저장된 게시글 1건
        // when: 빈 title 로 update 호출
        // then: Controller layer @Valid 에서 400 (별도 통합 테스트로 검증)
        // TODO 학생 구현
        assertThat(true).isTrue(); // placeholder
    }
}
