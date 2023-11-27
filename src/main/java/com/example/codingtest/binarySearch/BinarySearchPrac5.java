package com.example.codingtest.binarySearch;
//임의의 순환 정렬 배열에서 특정 값 찾기
public class BinarySearchPrac5 {
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
            }else {
                if (arr[mid] < target && target <= arr[end]){
                    start = mid + 1;
                } else {
                  end = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = search(nums, target);
        System.out.println("특정 값의 인덱스: " + index);
    }
}
