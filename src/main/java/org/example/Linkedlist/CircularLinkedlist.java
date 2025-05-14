package org.example.Linkedlist;



public class CircularLinkedlist {

   public static class Node {

        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;

        }


    }
    public static boolean solution(Node head){

        if(head==null) return false;

        Node slow=head;
        Node fast =head;


        while (fast!=null && slow!=null){

            slow=slow.next;
            fast= fast.next.next;
            if (slow == fast) return true;

        }


        return false;
    }
}
