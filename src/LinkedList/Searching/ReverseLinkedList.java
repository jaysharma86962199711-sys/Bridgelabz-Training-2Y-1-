package LinkedList.Searching;

public class ReverseLinkedList {
        public static class Node {
            int data;
            LinkedList.Searching.DoublyLinkedList.Node prev;
            LinkedList.Searching.DoublyLinkedList.Node next;

            public Node(int data) {
                this.data = data;
                this.prev=null;
            }
        }
        public static LinkedList.Searching.DoublyLinkedList.Node head;
        public static LinkedList.Searching.DoublyLinkedList.Node tail;
        public static void display() {
            LinkedList.Searching.DoublyLinkedList.Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public static void reverse(){
            LinkedList.Searching.DoublyLinkedList.Node temp = tail;
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.prev;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            LinkedList.Searching.DoublyLinkedList.Node a = new LinkedList.Searching.DoublyLinkedList.Node(10);
            LinkedList.Searching.DoublyLinkedList.Node b = new LinkedList.Searching.DoublyLinkedList.Node(20);
            LinkedList.Searching.DoublyLinkedList.Node c = new LinkedList.Searching.DoublyLinkedList.Node(30);
            LinkedList.Searching.DoublyLinkedList.Node d = new LinkedList.Searching.DoublyLinkedList.Node(40);
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
            reverse();
        }
}
