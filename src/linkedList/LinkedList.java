package linkedList;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList(){
        head = null;
    }

    public void traverse(){
        Node current = head;
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public Node search(char data){
        Node curr = head;
        while(curr.getNext() != null){
            if(curr.getData() == data){
                return curr;
            }
        } return null;
    }


    public void insertAtEnd(char data){
        Node newNode = new Node(data,null);       //creating a new node pointing to null;
        if(head==null){           //if list is empty point the head to the new node;
            head = newNode;
        }
        else {
            Node curr = head;
            while (curr.getNext() != null) {    //travelling till last element which points to null
                curr = curr.getNext();         //set the current element pointing to the last element
            }
            curr.setNext(newNode);              //setting the newNode as next of current element;
        }
        size++;
    }

    public void insertAtFront(char data){
        Node newNode  = new Node(data,null);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.setNext(head);  //since head is the one pointing to the first Node in the list..
            head = newNode;
        }
        size++;
    }

    public void insertAtIndex(int position ,char data){
        Node newNode = new Node(data,null);
        int currentIndex = 0;

        Node curr = head;

        if(curr!=null) {
            while (currentIndex < position && curr.getNext() != null) {
                curr = curr.getNext();
                currentIndex++;
            }
        }
        else{
            head = newNode;
        }
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);
        size++;
    }



    public void deleteAtFront(){
        if(head != null) {
            head = head.getNext();
        }
        size--;
    }

    public void deleteAtEnd(){

        if(head != null && head.getNext() != null){
            Node curr = head;
            while(curr.getNext().getNext() != null){
                curr = curr.getNext();
            }
            curr.setNext(null);
        }
        else if(head != null && head.getNext() == null){
            head = null;
        }
        size--;
    }

    public int size(){
        return size;
    }

    public void reverseIterate(){
        if(head == null || head.getNext() == null){
            return;
        }
        Node prevNode  = head;
        Node currNode = head.getNext();

        while(currNode != null){
            Node nextNode = currNode.getNext();
            currNode.setNext(prevNode);

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.setNext(null);
        head = prevNode;
    }

}
