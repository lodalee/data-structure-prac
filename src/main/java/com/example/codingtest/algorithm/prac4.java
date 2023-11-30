package com.example.codingtest.algorithm;
//회문 판별하기 "level"
public class prac4 {
    public boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() -1;

        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        prac4 p = new prac4();
        String str = "level";

        Boolean answer = p.isPalindrome(str);
        System.out.println(answer);

    }
}
