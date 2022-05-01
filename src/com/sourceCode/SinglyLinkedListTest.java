package com.sourceCode;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        ListNode head;
        head = new ListNode(20);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(13);
        ListNode fourth = new ListNode(16);

        head.next = second;
        second.next =third;
        third.next = fourth;


    }




    private static class ListNode{
        private int data; //generic type
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next=null;
        }
    }

}
