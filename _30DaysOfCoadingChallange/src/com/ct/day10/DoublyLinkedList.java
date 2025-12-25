package com.ct.day10;

public class DoublyLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
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
        newNode.prev = temp;
    }

    // Traverse forward
    void traverse() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Delete by value
    void delete(int value) {
        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) return;

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    // Reverse Doubly Linked List
    void reverse() {
        Node curr = head;
        Node temp = null;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    // 🔥 MAIN METHOD
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.add(40);

        System.out.println("Original Doubly Linked List:");
        dll.traverse();

        System.out.println("After Deleting 30:");
        dll.delete(30);
        dll.traverse();

        System.out.println("After Reversing:");
        dll.reverse();
        dll.traverse();
    }
}
