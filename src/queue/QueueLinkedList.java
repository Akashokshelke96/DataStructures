package queue;

import org.w3c.dom.Node;

public class QueueLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //enqueue
        public static void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                tail = head = newNode;//if empty list is there then both head and tail point to same newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;
        }
    }
}
