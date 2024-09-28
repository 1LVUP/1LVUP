[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/ZF6vyJyc)
# Box and Rectangle

## 제출 기한

- 9/28 23:59

## 구현 사항

- 아래 두개의 클래스를 `app/src/main/java`에 있는 `Box.java`와 `Rec.java`를 이용하여 구현한다.

### 1. **Box 클래스**:

- **필드**:
  - 가로(`width`), 세로(`height`), 깊이(`depth`): 각각 `float` 타입.
  - `materialType`: `char` 타입, 'P'(Plastic), 'M'(Metal), 'W'(Wood) 중 하나여야 함.
  - `weight`: `double` 타입으로, 박스의 무게를 나타냄.

- **메서드**:
  - `calculateVolume()`: 박스의 부피를 계산. 부피는 `float` 타입으로 반환.
  - `getWeight()`: 박스의 무게를 반환하는 메서드. 반환 타입은 `double`.
  - `isHeavierThan(Box other)`: 두 박스의 무게를 비교하여, 현재 박스가 더 무거운지 확인. `boolean`을 반환.
  - `equals(Box other)`: 가로, 세로, 깊이, 재료 타입(`materialType`)이 모두 같으면 동일한 박스로 간주.
  - **유효하지 않은 입력**: 가로, 세로, 깊이가 0 이하일 경우 각각 1.0으로 설정, `materialType`이 지정된 값 중 하나가 아닐 경우 기본값으로 'P'(Plastic)를 설정.

- **getter 및 setter**:
  - `getWidth()`, `setWidth(float width)`: 가로를 가져오거나 설정.
  - `getHeight()`, `setHeight(float height)`: 세로를 가져오거나 설정.
  - `getDepth()`, `setDepth(float depth)`: 깊이를 가져오거나 설정.
  - `getMaterialType()`, `setMaterialType(char materialType)`: 재료 타입을 가져오거나 설정.
  - `getWeight()`, `setWeight(double weight)`: 무게를 가져오거나 설정.

- **추가 메서드**:
  - `toRec()`: 박스의 가로(`width`)와 세로(`height`) 값을 이용해 새로운 `Rec` 객체를 반환하는 메서드. 반환 타입은 `Rec`.

### 2. **Rec 클래스**:

- **필드**:
  - 가로(`width`), 세로(`height`): `int` 타입으로 정의.
  - `colorCode`: `char` 타입, 'R'(Red), 'G'(Green), 'B'(Blue) 중 하나여야 함.
  - `borderThickness`: `float` 타입으로, 직사각형 테두리의 두께를 나타냄.

- **메서드**:
  - `calculateArea()`: 직사각형의 면적을 계산하여 `int` 타입으로 반환.
  - `hasSameArea(Rec other)`: 두 직사각형의 면적을 비교하여, 면적이 동일한지 확인. `boolean`을 반환.
  - `getBorderThickness()`: 테두리의 두께를 반환하는 메서드. `float` 타입을 반환.
  - **유효하지 않은 입력**: 가로, 세로가 0 이하일 경우 각각 1로 설정, `colorCode`가 지정된 값이 아닐 경우 기본값으로 'R'(Red)을 설정.

- **getter 및 setter**:
  - `getWidth()`, `setWidth(int width)`: 가로를 가져오거나 설정.
  - `getHeight()`, `setHeight(int height)`: 세로를 가져오거나 설정.
  - `getColorCode()`, `setColorCode(char colorCode)`: 색상 코드를 가져오거나 설정.
  - `getBorderThickness()`, `setBorderThickness(float borderThickness)`: 테두리 두께를 가져오거나 설정.

### 3. **추가 기능 및 요구 사항**:

- `Box` 클래스는 `Rec` 클래스를 이용하여 바닥 면적을 계산하는 `toRec()` 메서드를 구현해야 한다. 이 메서드는 박스의 가로(`width`)와 세로(`height`) 값을 이용해 새로운 `Rec` 객체를 반환한다.
- `Rec` 클래스는 `Box` 클래스를 참조하지 않고 독립적으로 동작해야 한다.

### 4. **보고서 작성**:
- REPORT.md 에 본인이 구현한 코드에서 활용한 Java 문법에 관해 설명하며, ChatGPT 등 생성형 AI를 활용했다면 어떻게 활용했는지 방법을 적는다.

## 제출 및 테스트 방법
- `App.java`의 `main` 메서드에서 테스트 코드를 작성하여 다양한 케이스를 테스트 
- 해당 main 함수 실행시 본인 VSCode 터미널에서 `./gradlew run` 실행 (Windows 환경에서는 `./gradlew.bat run`)
- `git add [파일명]`, `git commit -m [커밋로그]`, `git push` 를 차례로 실행하여 제출
- `git push`로 코드 제출 시 GitHub Action에 의해서 테스트 수행됨
- 수업시간에 설명한대로 VSCode에서 제공하는 Source Control을 이용하여 git 명령어를 사용할 수 있으나, 해당 프로젝트가 위치한 경로에 한글명이 포함되면 안되는 문제가 발생할 수 있음
- 테스트 파일은 제공되지 않으며 GitHub Action이 실행되는 머신에서 실행되어 제출된 과제를 평가
- GitHub 저장소에 **Actions** 탭에서 테스트 결과 확인 가능