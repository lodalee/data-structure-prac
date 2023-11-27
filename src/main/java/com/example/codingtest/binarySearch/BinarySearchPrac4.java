package com.example.codingtest.binarySearch;
//정렬된 행렬에서 특정 값 찾기
public class BinarySearchPrac4 {
    public static boolean searchNum(int [][] arr, int target){
        if (arr == null || arr.length == 0 || arr[0].length == 0){
            return false;
        }

        int rows = arr.length;
        int cols = arr[0].length;
        int start = 0;
        int end = rows * cols - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            int midVal = arr[mid / cols][mid % cols];

            if (midVal == target) {
                return true;
            } else if (midVal < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;

        boolean found = searchNum(arr, target);
        System.out.println("특정 값이 존재하는지: " + found);
    }
}
