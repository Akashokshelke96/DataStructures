package linkedList;


public class Application {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.insertAtEnd('e');
        ll.insertAtEnd('d');
        ll.insertAtEnd('c');
        ll.insertAtEnd('b');
        ll.insertAtEnd('a');
        ll.insertAtFront('r');
        ll.insertAtFront('m');
        ll.insertAtFront('n');

        ll.insertAtIndex(2,'X');
        ll.deleteAtFront();
        ll.deleteAtEnd();

        //reversign a linked list
        ll.reverseIterate();
        ll.traverse();


        System.out.println(ll.size());



//        Node e = new Node('E',null);
//        Node d = new Node('D',e);
//        Node c = new Node('C',d);
//        Node b = new Node('B',c);
//        Node a = new Node('A',b);
//
//        Node head = a; //head node only points to A , it does not contain any data;
//
//        //printing the Linked List..take a current node as head , print and move the current head to next node;
//        Node current = head;
//        while(current != null){
//            System.out.println(current.getData());
//            current = current.getNext();
//        }
    }
}
