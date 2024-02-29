# 사다리 타기 기능 명세서

### 입력

- [x] 사용자들의 이름을 입력받는다.
    - [x] 이름은 쉼표를 기준으로 구분한다.
- [x] 실행 결과를 입력받는다.
  - [x] 실행 결과는 쉼표를 기준으로 구분한다.
- [x] 사다리의 높이를 입력받는다.
    - [x] 높이는 정수 형태의 문자여야 한다.
- [x] 결과를 보고 싶은 대상을 입력받는다.
  - [x] 사용자의 이름을 입력받을 수 있다.
  - [x] all을 입력받을 수 있다.

### 출력

- [x] 사용자의 이름을 출력한다.
  - [x] 사용자의 이름은 5글자 안에서 우측 정렬한다.
- [x] 사다리를 출력한다.
- [x] 실행 결과를 출력한다.
  - [x] 실행 결과는 5글자 안에서 우측 정렬한다.
- [x] 사용자의 실행 결과를 출력한다.
- [x] 사다리의 높이를 입력받는다.
    - [x] 높이는 정수 형태의 문자여야 한다.

### 출력

- [x] 사다리를 출력한다.
- [x] 사용자들의 이름은 사다리를 출력할 때 같이 출력한다.

### 사용자 (Player)

- [x] 사용자는 이름이 있다.
- [x] 이름은 양 옆 공백을 제외한 1자 이상이다.
- [x] 이름은 양 옆 공백을 제외한 5자 이하이다.

### 사용자들 (Players)

- [x] 중복된 사용자가 있는지 검증한다.
- [x] 사용자는 최소 2명 이상이여야 한다.

### 실행 결과 (Result)

- [x] 실행 결과는 값을 갖는다.
- [x] 값은 양 옆 공백을 제외한 1자 이상이다.
- [x] 값은 양 옆 공백을 제외한 5자 이하이다.

### 실행 결과 목록 (Results)

- [x] 실행 결과의 값은 중복될 수 있다.
- [x] 실행 결과의 수는 사용자들의 수와 동일하다.

### 게임 (Game)

- [x] 사다리 게임에 사용자가 참가한다.
- [x] 사용자는 라인을 거치며 위치가 달라진다.
  - [x] 라인에 있는 막대에 따라서 사용자가 다르게 움직인다.
  - [x] 라인에 막대가 있으면, 막대가 있는 방향으로 움직인다.
  - [x] 라인에 막대가 없으면, 바로 아래로 움직인다.

### 사다리 (Ladder)

- [x] 사다리는 높이를 가지고 있다.
  - [x] 높이는 1 이상이여야 한다.
- [x] 사다리는 라인을 가지고 있다.
  - [x] 라인의 수는 높이와 동일하다.

### 막대 생성기 (Stick Generator)

- [x] 막대를 생성할 수 있다.
    - [x] 난수를 받아서 1이면 채워진 막대이고, 0이면 비어있는 막대이다.

### 라인 (Line)

- [x] 라인은 막대로 이루어져있다.
    - [x] 막대의 수는 사용자들의 수와 동일하다.
- [x] 라인에 연속된 막대는 있을 수 없다.
