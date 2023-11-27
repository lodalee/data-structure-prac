package com.example.codingtest.binarySearch;

//정렬된 배열에서 특정 값의 개수 세기
public class BinarySearchPrac2 {
    public static int countNumber(int[] arr, int target){
        int firstIndex = findFirstIndex(arr, target);
        int lastIndex = findLastIndex(arr, target);

        if (firstIndex == -1 || lastIndex == -1){
            return 0;
        }

        return lastIndex - firstIndex + 1;
    }

    private static int findFirstIndex(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;
        int firstIndex = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                firstIndex = mid;
                right = mid -1;
            } else if (arr[mid] < target){
                left = mid + 1;
            }else {
                right = mid -1;
            }
        }
        return firstIndex;
    }

    private static int findLastIndex(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;
        int lastIndex = -1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                lastIndex = mid;
                left = mid +1;
            } else if (arr[mid] < target){
                left = mid + 1;
            }else {
                right = mid -1;
            }
        }
        return lastIndex;
    }



    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int count = countNumber(arr, target);
        System.out.println("특정 값의 개수: " + count);
    }
}
