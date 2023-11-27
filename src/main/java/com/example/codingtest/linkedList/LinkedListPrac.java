package com.example.codingtest.linkedList;

//연결리스트 뒤집기
public class LinkedListPrac {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}

class Main {
    public static void main(String[] args) {
        LinkedListPrac list = new LinkedListPrac();

        // 노드 추가
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);

        // 연결 리스트 출력
        printList(list.head);

        // 연결 리스트 뒤집기
        list.reverse();

        // 뒤집힌 연결 리스트 출력
        printList(list.head);
    }

    static void printList(LinkedListPrac.Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}




//현재 노드의 next 포인터를 이전 노드(prev)로 설정합니다.
//이렇게 하면 현재 노드는 이전 노드를 가리키게 됩니다.
//이제 prev와 current를 한 노드씩 뒤로 이동시킵니다.
//prev는 current를 가리키도록 하고, current는 다음 노드를 가리키도록 합니다.