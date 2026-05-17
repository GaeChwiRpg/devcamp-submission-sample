# Evidence

이 폴더는 본 미션의 핵심 학습 포인트가 본인 작업에 적용된 흔적을 남기는 곳입니다.

## API 자산

- `api-contract.md` — endpoint/메서드/상태코드 정리
- `response-samples.md` — Postman 호출 성공/실패 응답
- `test-results.md` — 테스트 3개 이상 실행 결과 + 성공/실패/예외 케이스

## 설계 의사결정 자산 (필수)

- `layer-separation-notes.md` — 3계층(Controller/Service/Repository) 분리 근거
- `transactional-snapshot.md` — @Transactional 적용 위치와 선택 근거

## 작성 원칙

- "코드를 짰다"는 사실보다 "**왜 이 경계로 나눴는지**"가 본문의 80% 이상을 차지해야 합니다.
- @Transactional은 **모든 메서드에 붙이지 말 것**. 붙인 곳/안 붙인 곳의 근거가 evidence에 보여야 합니다.
- Postman 호출은 4 endpoint 모두 (성공 + 실패 한 케이스 이상) 캡처.
