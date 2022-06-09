package linkedList;

public class Application {
    public static void main(String[] args) {

        Node e = new Node('E',null);
        Node d = new Node('D',e);
        Node c = new Node('C',d);
        Node b = new Node('B',c);
        Node a = new Node('A',b);

        Node head = a; //head node only points to A , it does not contain any data;

        //printing the Linked List..take a current node as head , print and move the current head to next node;
        Node current = head;
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
