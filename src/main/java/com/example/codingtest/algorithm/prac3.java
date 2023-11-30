package com.example.codingtest.algorithm;
//문자열 압축하기
public class prac3 {
    public String compress(String str){
        int count = 1;
        StringBuilder compressed = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == str.charAt(i+1)){
                count++;
            } else {
                compressed.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length() -1 )).append(count);
        return compressed.toString();
    }

    public static void main(String[] args){
        prac3 p = new prac3();
        String str = "hhello";

        String answer = p.compress(str);
        System.out.println(answer);

    }
}
