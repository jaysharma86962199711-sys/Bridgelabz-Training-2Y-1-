package LinkedList.Searching;

public class DoublyLinkedList {
    public static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev=null;
        }
    }
        public static Node head;
        public static Node tail;
        public static void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
            }
        public static void main(String[] args) {
            Node a = new Node(10);
            Node b = new Node(20);
            Node c = new Node(30);
            Node d = new Node(40);
            head = a;
            tail = d;
            a.prev=null;
            a.next=b;
            b.prev=a;
            b.next=c;
            c.prev=b;
            c.next=d;
            d.prev=c;
            d.next=null;
            display();
        }
}
