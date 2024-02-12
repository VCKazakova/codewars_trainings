package ru.kazakova.codewars.february;

public class TaskFromInt {

    public static void main(String[] args) {
        Node node = new Node(new Node(new Node(new Node(), 3), 5), 2);
        writeNodes(node);
    }

    public static void writeNodes(Node head) {
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }

    static class Node {
        Node next;
        int value;

        Node() {

        }

        Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }
}
