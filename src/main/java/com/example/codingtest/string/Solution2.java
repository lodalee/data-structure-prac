package com.example.codingtest.string;

public class Solution2 {

    //문자열 겹쳐쓰기
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        String sub = my_string.substring(0,s);
        String subend = my_string.substring(s + overwrite_string.length());

        answer = sub + overwrite_string + subend;
        return answer;
    }

    //문자열 섞기
    public String solution(String str1, String str2) {
        String answer = "";

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            newString.append(str1.charAt(i)).append(str2.charAt(i));
        }

        answer = newString.toString();

        return answer;
    }

    //문자 리스트를 문자열로 변환하기
    public String solution(String[] arr) {
        String answer = "";

        StringBuilder newArr = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            newArr.append(arr[i]);
        }
        answer = newArr.toString();

        return answer;
    }

    //문자열 곱하기
    public String solution(String my_string, int k) {
        String answer = "";

        answer = my_string.repeat(k);
        return answer;
    }
}
