package com.example.codingtest.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Stack_1 {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();

        int prev = -1;

        for (int num : arr){
            if(num != prev){
                queue.offer(num);
                prev = num;
            }
        }

        int[] answer = new int[queue.size()];
        for (int i = 0 ; i < answer.length; i++){
            answer[i] = queue.poll();
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}
