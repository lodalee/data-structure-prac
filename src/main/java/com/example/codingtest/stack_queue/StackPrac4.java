package com.example.codingtest.stack_queue;

//숫자 뒤집기
public class StackPrac4 {
    public static void main(String[] args) {
        int number = 12345;
        reverseNumber(number);
    }

    public static void reverseNumber(int number) {
        Stack<Integer> stack = new Stack<>();

        while (number != 0) {
            stack.push(number % 10);
            number = number / 10;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}

