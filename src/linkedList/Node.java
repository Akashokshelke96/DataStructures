package linkedList;

public class Node {
    char data;
    Node next;

    public Node(char data, Node next) {
        this.data = data;
        this.next = next;
    }

    public char getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(char data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
