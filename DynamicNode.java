package LinkedList;

public class DynamicNode {

    public static void main(String[] args) {
        Node node1 = new Node(30, null);
        System.out.println("This is node1 " + node1.value);
        System.out.println("This is node1 " + node1.next);

        Node node2 = new Node(23, null);
        System.out.println("This is node2 " + node2.value);
        System.out.println("This is node2 " + node2.next);

        Node node3 = new Node(13, node2);
        System.out.println("This is node3 " + node3.value);
        System.out.println("This is node3 " + node3.next);
    }
}
