package co.dingcodingco.week1sample.api.common;

import java.util.Map;

// 🧪 sample PR placeholder — 에러 응답 형식 예시
public record ApiErrorResponse(
    String error,
    String message,
    Map<String, String> fields
) {
    public static ApiErrorResponse of(String error, String message) {
        return new ApiErrorResponse(error, message, null);
    }
}
