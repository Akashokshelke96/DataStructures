package com.sourceCode;

public class SinglyLinkedListTest {

    private ListNode head;

    private static class ListNode{
        private int data; //generic type
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next=null;
        }
    }
}
