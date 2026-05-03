# 09-week8-ai-native

> 교재: `books/05-week8-10x-ai-native-developer.md` (7주차 본문 핵심)

이번 주는 "AI를 썼다"가 아니라 **AI 네이티브 개발 워크플로우 6 요소를 본인 미션에 실제로 적용하고 그 차이를 evidence로 증명**하는 미션입니다. AI가 좋아 보이는 결과를 줘도 검증 루프를 어떻게 돌렸는지 안 적혀 있으면 통과 기준 미달입니다.

## 교재 6 요소 (이번 주 적용 대상)

1. **Context Engineering** — 3 유형(코드 / 파일·문서 / 이미지) 중 본인 미션에 맞는 컨텍스트 패키징
2. **Needle in a Haystack 관리** — 요약 / `claude.md` GPS / `/clear` 리셋 중 1개 전략 적용
3. **페목형제 프롬프트** — 페르소나·목표·형식·제약 4 요소가 다 보이는 프롬프트
4. **`claude.md` 헌법** — 프로젝트 규칙·도메인·제약을 AI에게 주입한 본문
5. **`/.claude/commands/` 커스텀 명령** — 반복 작업 자동화 1개
6. **Claude Hooks** — 규칙 위반 자동 차단 1개

## 이번 주에 해야 하는 것

- 이전 주차 미션(예: Week 4 인덱스, Week 5 동시성, Week 6 프로파일링 중 1개)을 골라 **위 6 요소를 적용해서 다시** 풀이
- 각 요소가 어떻게 작동했는지 evidence 6~7개로 남김
- AI가 잘못 답한 사례 3개와 그것을 어떻게 잡아냈는지 별도 기록
- 사람-only 워크플로우 vs AI-native 워크플로우의 차이를 시간·탐색폭·검증 루프 단위로 비교

## 이번 주에 제출할 것

| evidence 파일 | 교재 매핑 |
| --- | --- |
| `report.md` | (시도/판단/결과/회고) |
| `evidence/claude-md-snapshot.md` | 4. claude.md 헌법 |
| `evidence/commands-snapshot.md` | 5. Commands |
| `evidence/hooks-config.md` | 6. Hooks |
| `evidence/prompt-pack.md` | 3. 페목형제 |
| `evidence/context-strategy.md` | 1·2. Context + Needle 관리 |
| `evidence/workflow-before-after.md` | 종합 비교 |
| `evidence/failure-cases.md` | 검증 루프 |

(팀 산출물 `team-ai-rules.md`는 Week 9 진입 직전 별도 정리.)

## 평가 기준

- 6 요소 중 4개 이상이 **실제로 작동한 흔적**이 evidence에 있는가 (단순 메모 X)
- AI 결과를 검증한 명확한 절차가 보이는가
- before/after 비교가 시간·탐색폭·실패 패턴 단위로 정량화되었는가
- 페목형제 프롬프트 3개에서 페·목·형·제 4 요소가 다 보이는가

## 이 샘플에서 먼저 볼 것

1. `report.md` — 6 요소 적용 흐름 요약
2. `evidence/claude-md-snapshot.md` 와 `evidence/hooks-config.md`
3. `evidence/prompt-pack.md` — 페목형제 적용 예시 3개
4. `evidence/workflow-before-after.md` — 사람-only vs AI-native 비교

핵심은 AI를 사용한 사실이 아니라, **개발 방식이 어떻게 측정 가능하게 좋아졌는지**입니다.
