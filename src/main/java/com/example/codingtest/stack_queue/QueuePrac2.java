package com.example.codingtest.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

//요세푸스 문제 - 원을 이루고 앉아있는 k번째 사람 제거
public class QueuePrac2 {
    public static void main(String[] args) {
        System.out.println(josephusProblem(7, 3));  // (7, 3)-요세푸스 순열의 마지막 생존자를 출력
    }

    public static int josephusProblem(int n, int k){
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++){
            queue.offer(i);
        }

        while (queue.size() > 1){
            for (int i = 0; i < k - 1; i++){
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }
}

//맨 앞에 있는 사람(숫자)을 맨 뒤로 보냅니다. 이 작업을 k-1번 반복합니다.
//그 다음 맨 앞에 있는 사람(숫자)을 제거합니다.
