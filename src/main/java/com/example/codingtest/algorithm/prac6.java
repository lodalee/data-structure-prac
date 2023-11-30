package com.example.codingtest.algorithm;

import java.util.Arrays;

//최대값, 최소값 구하기
public class prac6 {
//    int min = 0;
//    int max = 0;
//    public int findMinNum(int arr[]){
//        Arrays.sort(arr);
//        return min = arr[0];
//    }
//
//    public int findMaxNum(int arr[]){
//        Arrays.sort(arr);
//        return max = arr[arr.length-1];
//    }

    // 위의 방식으로 하면 배열을 정렬하는 과정에서 추가적인 연산이 필요하다.

    public int findMinNum(int[] arr){
        int min = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public int findMaxNum(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        prac6 p = new prac6();
        int[] arr = {4,8,6,3,5,1,9};

        int minNum = p.findMinNum(arr);
        int maxNum = p.findMaxNum(arr);

        System.out.println("minNum = " + minNum);
        System.out.println("maxNum = " + maxNum);
    }
}
