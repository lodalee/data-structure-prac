package com.example.codingtest.binarySearch;

//만약 정렬되지 않은 배열이라면?

import java.util.Arrays;

public class BinarySearchPrac {
    public static int binarySearchPrac(int[] arr, int target){

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        if (arr[start] == target){
            return start;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 3, 9};
        int target = 3;
        int result = binarySearchPrac(arr, target);

        if (result != -1) {
            System.out.println("타겟 값의 인덱스: " + result);
        } else {
            System.out.println("타겟 값이 배열에 존재하지 않습니다.");
        }
    }
}

