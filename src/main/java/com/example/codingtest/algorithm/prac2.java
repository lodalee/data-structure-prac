package com.example.codingtest.algorithm;
// 문자열 뒤집기
public class prac2 {
    public String reverse(String str){
        StringBuilder reversed = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        prac2 p = new prac2();
        String str = "Hello";

        String answer = p.reverse(str);
        System.out.println(answer);
    }
}

