package LinkedList;

public class DynamicNode {

    public static void main(String[] args) {
        Node node1 = new Node(30, null);
        System.out.println("This is node1 " + node1.value);
        System.out.println("This is node1 " + node1.next);

        Node node2 = new Node(23, null);
        System.out.println("This is node2 " + node2.value);
        System.out.println("This is node2 " + node2.next);

        Node node3 = new Node(22, new Node(23, null));

        Node node4 = new Node(13, node3);
        System.out.println("This is node4 " + node4.value);
        System.out.println("This is node4 " + node4.next);
        System.out.println("This is node3 value " + node4.next.value);
        System.out.println("This is node3 new node value " + node4.next.next.value);

        LinkNode node5 = new LinkNode(100);
        node5.add(200);
        node5.add(500);
        node5.add(2005);

        node5.print();
    }
}
