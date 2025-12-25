package com.ct.day8;

class DoubleNode {
    int data;
    DoubleNode next ,prev;

    public DoubleNode(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

public class DoublyLinkedListDemo {
    public static void main(String[] args) {

        DoubleNode head = new DoubleNode(20);
        DoubleNode node10 = new DoubleNode(10);
        DoubleNode node30 = new DoubleNode(30);

        // Correct linking
        node10.next = head;
        head.prev = node10;

        head.next = node30;
        node30.prev = head;

        // Traverse forward
        DoubleNode current = node10;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}