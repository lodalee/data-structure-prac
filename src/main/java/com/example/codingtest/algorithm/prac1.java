package com.example.codingtest.algorithm;
// 구구단 출력하기
public class prac1 {
    public void gugudan(){
        for (int i = 2; i <= 9; i++){
            for (int j =1; j <= 9; j++){
                System.out.println( i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        prac1 p = new prac1();
        p.gugudan();
    }
}
