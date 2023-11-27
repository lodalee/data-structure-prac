package com.example.codingtest.stack_queue;

public class QueuePrac {

    private int maxSize;
    private int front;
    private int rear;
    private int nItems;
    private int[] queueArray;

    public QueuePrac(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        nItems = 0;
        queueArray = new int[maxSize];
    }

    // 큐의 끝에 요소 추가
    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }

        queueArray[++rear] = value;
        nItems++;
    }

    // 큐의 앞에서 요소 제거
    public int dequeue() {
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }

        nItems--;
        return temp;
    }

    // 큐가 비어있는지 확인
    public boolean isEmpty() {
        return (nItems == 0);
    }

    // 큐가 가득 찼는지 확인
    public boolean isFull() {
        return (nItems == maxSize);
    }
}
