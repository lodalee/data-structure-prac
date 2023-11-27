package com.example.codingtest.stack_queue;

import java.util.LinkedList;

//LinkedList 를 활용한 Queue

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void enqueue(T element){
        list.addLast(element);
    }

    public T dequeue(){
        if (isEmpty()){
            return null;
        } else {
            return list.removeFirst();
        }
    }

    public T peek(){
        if (isEmpty()){
            return null;
        } else {
            return list.getFirst();
        }
    }
}

// 동적으로 크기가 변하는 큐를 쉽게 구현할 수 있다.
