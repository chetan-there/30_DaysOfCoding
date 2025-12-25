package com.ct.day10;

public class CircularLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    // Add at end
    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Traverse
    void traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // Delete by value
    void delete(int value) {
        if (head == null) return;

        Node curr = head;
        Node prev = tail;

        do {
            if (curr.data == value) {

                // only one node case
                if (head == tail) {
                    head = tail = null;
                }
                // delete head
                else if (curr == head) {
                    head = head.next;
                    tail.next = head;
                }
                // delete tail
                else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                }
                // delete middle node
                else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Reverse Circular LinkedList
    void reverse() {
        if (head == null || head.next == head) return;

        Node prev = tail;
        Node curr = head;
        Node next;

        do {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } while (curr != head);

        tail = head;
        head = prev;
    }

    // 🔥 MAIN METHOD
    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();

        cll.add(10);
        cll.add(20);
        cll.add(30);
        cll.add(40);

        System.out.println("Original Circular Linked List:");
        cll.traverse();

        System.out.println("\nAfter Deleting 20:");
        cll.delete(20);
        cll.traverse();

        System.out.println("\nAfter Reversing:");
        cll.reverse();
        cll.traverse();
    }
}
