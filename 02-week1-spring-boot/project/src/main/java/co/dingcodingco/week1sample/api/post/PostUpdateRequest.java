package co.dingcodingco.week1sample.api.post;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// 🧪 sample PR placeholder
public record PostUpdateRequest(
    @NotBlank @Size(max = 100) String title,
    @NotBlank @Size(max = 2000) String content
) {}
