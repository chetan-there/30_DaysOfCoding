package com.ct.day10;

public class SinglyLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Add at end
    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Traverse
    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Delete by value
    void delete(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Reverse
    void reverse() {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // 🔥 MAIN METHOD
    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();

        sll.add(10);
        sll.add(20);
        sll.add(30);
        sll.add(40);

        System.out.println("Original Singly Linked List:");
        sll.traverse();

        System.out.println("After Deleting 20:");
        sll.delete(20);
        sll.traverse();

        System.out.println("After Reversing:");
        sll.reverse();
        sll.traverse();
    }
}
