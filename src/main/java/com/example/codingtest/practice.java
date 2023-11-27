package com.example.codingtest;

//임의의 순환 정렬 배열에서 특정 값 찾기
//{4, 5, 6, 7, 0, 1, 2}
public class practice {
    public static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (arr[start] <= arr[mid]){
                if (arr[start] <= target && target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target && target <= arr[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
