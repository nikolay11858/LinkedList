package LinkedList;

public class Node {
    int value;
    Node next;

    Node(int value, Node node) {
        this.value = value;
        next = node;
    }
}

class LinkNode {
    Node head;
    Node tail;

    LinkNode(int data) {
        head = new Node(data, null);
        tail = head;
    }

    void add(int data) {
        tail.next = new Node(data, null);
        tail = tail.next;
    }
    void print() {
        Node ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
    }
}
