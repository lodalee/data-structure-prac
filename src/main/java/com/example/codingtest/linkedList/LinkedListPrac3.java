package com.example.codingtest.linkedList;

//k번째 노드 찾기

public class LinkedListPrac3 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node findNode(int k){
        Node current = head;
        int count = 0;

        while (current != null){
            if (count == k){
                return current;
            }
            count ++;
            current = current.next;
        }

        return null;
    }
}
