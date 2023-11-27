package com.example.codingtest.stack_queue;

import java.util.*;
import java.util.Queue;

//우선순위가 높은 것부터 출력 - 프린터
public class QueuePrac3 {

    //문서의 위치와 우선순위 저장
    static class Document {
        int location;
        int priority;

        Document(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }

    public static int printerQueue(int[] arr, int location) {
        Queue<Document> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.offer(new Document(i, arr[i]));
        }

        Arrays.sort(arr);
        int size = arr.length - 1;
        int answer = 1;

        while (!queue.isEmpty()) {
            Document current = queue.poll();
            if (current.priority == arr[size]) {
                if (current.location == location) {
                    return answer;
                }
                answer++;
                size--;
            } else {
                queue.offer(current);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(printerQueue(priorities, location));  // 출력 예시
    }

}
