package com.example.codingtest.stack_queue;

//문자 역순 출력 - 응용하면 앞/뒤 페이지 이동
public class StackPrac3 {
    public String revers(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}

//이 코드는 입력받은 문자열 s를 순회하면서 각 문자를 스택에 푸시합니다.
//그리고 스택이 비어있을 때까지 스택의 최상단 원소를 팝하여 StringBuilder 객체에 추가합니다.
//스택에서 팝하는 순서대로 문자를 추가하면, 원래 문자열의 역순이 됩니다.

//String 은 불변 객체로 변경할 수 없다. 새로운 String 객체가 생성되는 것.
//이는 메모리 성능에 부담
//StringBuilder 클래스는 가변 객체로 내부적으로 문자열을 변경하거나 추가하는 연산을 효율적으로 수행
