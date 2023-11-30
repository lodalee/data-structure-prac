package com.example.codingtest.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Stack_2 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int currentWeight = 0;
        Queue<Integer> bridge = new LinkedList<>();

        for (int truckWeight : truck_weights) {
            while (true){
                if (bridge.isEmpty()){
                    bridge.offer(truckWeight);
                    currentWeight += truckWeight;
                    answer++;
                    break;
                } else if (bridge.size() == bridge_length) {
                    currentWeight-= bridge.poll();
                } else {
                    if (currentWeight + truckWeight <= weight){
                        bridge.offer(truckWeight);
                        currentWeight += truckWeight;
                        answer++;
                        break;
                    } else {
                        bridge.offer(0);
                        answer++;
                    }
                }
            }
        }

        return answer + bridge_length;
    }
}
