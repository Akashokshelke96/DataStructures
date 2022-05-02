package com.sourceCode;

public class SinglyLinkedList {
    private static ListNode head;

    private static class ListNode{
        private int data; //generic type
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(333);
      ListNode second = new ListNode(23);
      ListNode third = new ListNode((45));
      ListNode fourth = new ListNode(22);

      head.next = second;
      second.next = third;
      third.next = fourth;


     //printing while going through linked list
      ListNode current = head;
      while(current != null){
          System.out.print(current.data + "--");
          current = current.next;
      }
        System.out.println("null");
    }






}
