package LinkedList.Searching;

public class DeleteLast {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
        public static Node head;
        public static void deleteLast(){
            if(head == null){
                return;            }
        }

    }

    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(10);
        head.next.next = new Node(10);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(10);
    }
}
