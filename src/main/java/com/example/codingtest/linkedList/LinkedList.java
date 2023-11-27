package com.example.codingtest.linkedList;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void appendAtStart(int data){
        Node node = new Node(data);
        node.next = null;

        if (head == null){
            head = node;
        } else {
            Node start = head;
            while (start.next != null){
                start = start.next;
            }
            start.next = node;
        }
    }

    public void appendAtLast(int data){
        Node node = new Node(data);
        node.next = null;

        if (head != null){
            node.next = head;
        }
        head = node;
    }

    public void appendAfter(Node prev_node, int data){
        if (prev_node == null){
            System.out.println("cannot be null");
            return;
        }

        Node node = new Node(data);
        node.next = prev_node.next;
        prev_node.next = node;
    }

    public void deleteAtStart(){
        if (head != null){
            head = head.next;
        }
    }

    public void deleteAtLast(){
        Node temp = head, prev = null;

        while (temp.next != null){
            prev = temp;
            temp = temp.next;
        }

        if (prev != null){
            prev.next = null;
        } else {
            head = null;
        }
    }

    public void deleteAfter(Node prev_node){
        if (prev_node != null && prev_node.next != null){
            prev_node.next = prev_node.next.next;
        }
    }

    public void printList(){
        Node currNode = head;

        while (currNode != null){
            System.out.println(currNode.data + " ");

            currNode = currNode.next;
        }
    }
}
