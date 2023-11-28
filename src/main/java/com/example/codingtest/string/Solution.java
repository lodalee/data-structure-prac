package com.example.codingtest.string;
import java.util.Scanner;

class Solution {

    //문자열 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //문자열 출력하기
        String a = sc.next();
        System.out.println(a);


        //문자열 반복해서 출력하기
        String b = sc.next();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print(b);
        }


        //문자열 붙여서 출력하기
        String c = sc.next();
        String d = sc.next();

        System.out.print(c+d);


        //문자열 돌리기
        String e = sc.next();

        for(int i = 0; i <= e.length() -1; i++){
            System.out.println(a.charAt(i));
        }
    }
}