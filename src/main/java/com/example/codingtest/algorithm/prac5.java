package com.example.codingtest.algorithm;

import java.util.Arrays;
import java.util.HashSet;

//배열에서 중복된 숫자 찾기
public class prac5 {
    public int duplicateNum(int[] arr){
        int answer = -1;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length -1 ; i++){
            if (arr[i] == arr[i+1]){
                answer = arr[i];
                break;
            }
        }
        return answer;
    }

    public int duplicateNumSet(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr){
            if (set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }

    public static void main(String[] args){
        prac5 p = new prac5();
        int[] arr = {3,6,2,4,1,2};

//        int duplicateNum = p.duplicateNum(arr);
//        System.out.println(duplicateNum);

        int duplicateNumSet = p.duplicateNumSet(arr);
        System.out.println(duplicateNumSet);
    }
}
