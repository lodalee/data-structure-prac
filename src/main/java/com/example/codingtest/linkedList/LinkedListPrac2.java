package com.example.codingtest.linkedList;

import java.util.HashSet;

//중복 노드 제거
public class LinkedListPrac2 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void removeDuplicates(){
        HashSet<Integer> hs = new HashSet<>();

        Node current = head;
        Node prev = null;
        while (current != null){
            int curval = current.data;

            if (hs.contains(curval)){
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }
}
//HashSet을 사용한 이유는 중복 요소를 효율적으로 확인하고 제거하기 위함입니다.
//HashSet은 내부적으로 HashMap을 사용하여 요소를 저장하며,
//이는 각 요소를 해시 테이블에 저장함을 의미합니다.
//이런 구조 덕분에 HashSet은 add(), remove(), contains() 등의 기본적인 연산을 상수 시간, 즉 O(1)의 시간 복잡도로 수행할 수 있습니다.
//연결 리스트에서 중복 요소를 제거하는 경우, 각 노드를 방문하면서 그 노드의 값이 이미 처리된 값인지 아닌지를 빠르게 판단해야 합니다.
//이때 HashSet의 contains() 메서드를 사용하면 이 판단을 즉시 할 수 있습니다. 만약 이 작업을 HashSet 없이 수행한다면,
//각 노드를 처리할 때마다 기존의 모든 노드를 검사해야 하므로 시간 복잡도가 O(n^2)이 됩니다.
//따라서 HashSet을 사용하면 중복 요소를 빠르고 효율적으로 제거할 수 있습니다.