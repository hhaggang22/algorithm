# 4장. 재귀

- 재귀란?

  - 재귀호출 : 함수 내에서 자기 자신을 또 다시 호출하는 행위
  - 재귀함수 : 재귀적으로 구현된 함수

- 재귀함수의 특징
  - 일반적으로 함수의 형태
  - 자기 자신을 호출하더라도 복사본을 만들어서 새 스택 프레임 메모리 공간을 할당받아 메소드의 상태 및 정보가 저장되는 형태를 가짐
  - 무한정 호출을 막기 위한 조건이 필요 => **기저 조건**
  - 반복문 보다는 매번 자기 자신을 복제하여 실행되므로 메모리 및 자원의 소모량이 크다.

```java
//sum 함수의 반복문과 재귀함수
private static int sum(int num){
  int result = 0;
  for(int i = 0; i <= num; i++){
    result += i;
  }

  return result;
}

//==

private static int sum(int range){
  if(range = 1){
    return range;
  }
  return range + sum(range -1); //sum 함수에 range 인수를 받아 계속해서 감소하는데, 마침내 1이 됐을 때 호출을 종료한다.
}
```
