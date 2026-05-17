# Evidence

이 폴더는 교재 `books/05-week8-10x-ai-native-developer.md`의 6 요소가 실제로 작동했는지 증명하는 자산을 모으는 곳입니다.

## 6 요소 매핑

- `claude-md-snapshot.md` — 본인이 작성한 CLAUDE.md 본문 + 왜 이 규칙들을 골랐는지
- `commands-snapshot.md` — 본인이 만든 커스텀 Command 1개 정의 + 실제 실행 로그
- `hooks-config.md` — Claude Hook 설정 1개 + 그 hook이 잡아낸 위반 사례
- `prompt-pack.md` — 페르소나·목표·형식·제약 4 요소가 보이는 프롬프트 3개 + 결과 요약
- `context-strategy.md` — 3 유형(코드/파일·문서/이미지) 중 사용한 컨텍스트 + Needle in a Haystack 관리 전략 1개
- `workflow-before-after.md` — 사람-only vs AI-native 워크플로우 비교 (시간·탐색폭·검증 루프·실패 패턴)
- `failure-cases.md` — AI가 잘못 답한 사례 3개 + 어떻게 잡아냈고 어떤 prompt로 수정했는지

## 작성 원칙

- "AI를 썼다"는 사실보다 "**무엇이 측정 가능하게 좋아졌는지**"가 본문의 80% 이상을 차지해야 합니다.
- prompt-pack.md의 프롬프트 3개는 단순 텍스트가 아니라 **페·목·형·제가 어디에 들어갔는지 표시**되어야 합니다.
- failure-cases.md는 AI가 그럴듯한 거짓말을 했을 때를 포함합니다(hallucination).
