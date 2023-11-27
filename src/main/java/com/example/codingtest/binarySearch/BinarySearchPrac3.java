package com.example.codingtest.binarySearch;

//정렬된 배열의 회전된 형태에서 최솟값 찾기
public class BinarySearchPrac3 {
    public static int findMinimum(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int minimum = findMinimum(nums);
        System.out.println("최솟값: " + minimum);
    }
}
