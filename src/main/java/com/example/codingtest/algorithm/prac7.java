package com.example.codingtest.algorithm;
//이진 탐색하기
public class prac7 {
    public int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                left = mid + 1 ;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        prac7 p = new prac7();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;

        int targetIndex = p.binarySearch(arr, target);
        System.out.println(targetIndex);

    }
}
