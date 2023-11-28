package com.example.codingtest.stack_queue;

//후위 표기식 계산 - 피연산자를 뒤에 위치시키는 방식
//String expression1 = "2 3 4 * +";
//String expression2 = "1 2 + 3 4 * +";
public class StackPrac2 {
    public int calculate(String s){
        Stack<Integer> stack = new Stack<>();

        for(String token : s.split("\\s")){
            switch (token){
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    int divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;

                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        StackPrac2 stackPrac2 = new StackPrac2();

        String expression = "1 2 + 3 4 * +";
        System.out.println(stackPrac2.calculate(expression)); // 15
    }
}
