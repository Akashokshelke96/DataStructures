package linkedList;


public class HareAndTortoiseMethod {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtFront('5');
        ll.insertAtFront('6');
        ll.insertAtFront('7');
        ll.insertAtFront('8');

       Node head =  null;
       ll.traverse();

    }
}
