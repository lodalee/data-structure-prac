package com.example.codingtest.binarySearch;

//정렬된 배열에서 특정 값의 인덱스 찾기

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            //(right - left)를 사용하면 항상 정확한 중간 위치를 계산할 수 있다.
            //오버플로우 방지
            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (arr[left] == target){
            return left;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 3;
        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("타겟 값의 인덱스: " + result);
        } else {
            System.out.println("타겟 값이 배열에 존재하지 않습니다.");
        }
    }
}
