# 3장. 연결리스트

- 노드란?
  `자료 구조에 데이터를 담거나 표현하는 기초 적인 단위`

  - 연결리스트의 노드 구성
    1. 데이터 공간 : 값을 저장
    2. 링크 공간(포인터 영역) : 자신을 제외한 인접한 노드를 가리킬 때 사용

- 연결리스트의 특징

  - 동적 할당이 가능함
  - 삽입과 삭제 연산에서 오버헤드가 배열보다 적음
    ```java
    오버헤드란?
    어떤 처리를 하기 위해 들어가는 간접적인 처리 시간 및 메모리
    ```
  - 특정 **인덱스로 접근이 불가능**하므로 검색시에는 순차적으로 첫 노드부터 끝까지 방문
    |종류|삽입|삭제|검색|
    |:---|:---:|:---:|:---:|
    |배열| △ | △ | O |
    |연결리스트| O | O | △ |

- 연결리스트 종류

  1. 단일 연결 리스트
     - 하나의 포인터 영역을 가지고 다음 노드를 가리킴
  2. 이중 연결 리스트
     - 자신의 앞과 뒤 노드를 가리키기 위해 두개의 포인터 영역을 가짐
  3. 원형 연결 리스트
     - 마지막 노드가 처음 노드를 가리킴
     - 항상 첫 노드를 가리키는 head 변수, 항상 마지막 노드를 가리키는 tail 변수 추가

- String vs StringBuilder
  |이름|특징|
  |:---|:---|
  |String|문자열을 합칠 때 새로운 변수를 할당해서 연산해야한다. => 메모리 할당과 해제가 많음|
  |StringBuilder|새로운 객체를 생성하지 않고 기존의 데이터에 더한다. |

  ```java
      String a = "abc";
      String b = "def";

      //String
      String c = a + b;
      System.out.println(c);

      //StringBuilder
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(a);
      stringBuilder.append(b);

      System.out.println(stringBuilder.toString());

  ```
