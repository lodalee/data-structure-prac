package com.example.codingtest.linkedList;

public class LinkedListPrac4 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean hasCycle(){
        if (head == null){
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while (slow != fast){
            if (fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}

//연결 리스트의 중간 노드가 뒤따르는 노드를 가리키는 경우에도 사이클이 발생합니다.
//이 경우에는 마지막 노드가 첫 번째 노드를 가리키지 않으므로,
//단순히 마지막 노드가 첫 번째 노드를 가리키는지만 확인하는 방법으로는 사이클을 감지할 수 없습니다.