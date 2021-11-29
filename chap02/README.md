# 2장. 배열

- 배열이란?

  `데이터 타입이 같은 여러 개의 변수를 한데 모아서 묶어 놓은 것`

  즉,
  `같은 자료형을 메모리 상에 연속적으로 나열한 형태`

- 배열의 특징

  - 배열의 변수는 **참조형 변수**이다.

    > int[] arr; 에서 *arr*는 어떠한 **메모리 주소** 값을 가지는 변수임

    > 참조형 변수는 초기화 없이 선언한 기본값은 null 이다.

    > 참조 변수를 통해 배열이 저장된 메모리에 접근할 수 있다.

  - Arrays.toString()은 배열의 요소들을 문자열로 조합하여 반환하는 함수이다.
  - 배열은 각 요소들을 읽어오거나 값을 저장하기 위하여 index가 필요하다. (<-> _연결리스트와 다른 점_)

- 배열의 초기화 방법

  ```java
  int[] arr1 = new int[1]; // 배열의 선언과 동시에 배열의 크기를 1으로 지정하고 0으로 초기화하는 방법
  int[] arr2 = new int[]{1,2,3}; // 배열 생성 시, 크기를 지정하지 않고 저장할 요소만 명시하는 방법
  int[] arr3 = {1,2,3,4,5}; // 저장할 요소만 명시하는 방법

  ```

- foreach

  - JDK1.5 부터 제공
  - 첨자 변수 대신 배열의 요소를 저장할 변수를 선언
  - for 에 비해 오류 가능성을 줄여주고, 반복문 로직에 좀 더 집중할 수 있다.
  - A : B = 배열에 요소를 담을 변수 : 순회할 배열의 참조 변수
  - index를 사용하지 않기 때문에 특정 위치에 값을 삽입, 삭제하거나 값을 읽어오는 경우 사용할 수 없다.

- 배열의 복사

  > 복사 동작의 기대 결과 == 원본 보존 & 사본으로 작업

  1. 얕은 복사
     `원본의 보존성을 유지하지 못함`

     - 메모리 주소를 공유한다.

     ```java
     int[] A = new A[3];
     int[] B = A; //A와 B에는 같은 메모리 주소가 들어가있다. => 결론적으로 같은 메모리 공간을 가리키기 때문에 B가 바뀌면 A도 바뀐다.
     ```

  2. 깊은 복사
     `원본의 보존성을 유지함`

     - 새 배열을 생성하고, 새 배열에 원본 배열의 요소 값들을 저장

     ```java
     int[] A = new A[3];
     int[] B = new B[A.length]; //새 배열을 생성해서

     for(int i = 0; i< A.length; i++){ //새 배열에 원본 배열의 요소 값들'만' 저장했기 때문에 두 배열이 서로 다른 배열 공간을 바라보고 있음
         B[i] = A[i];
     }
     ```