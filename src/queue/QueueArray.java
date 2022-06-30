package queue;

import jdk.swing.interop.SwingInterOpUtils;

public class QueueArray {
    //ARRAY IMPLEMENTATION OF QUEUE IS NOT USED CAUSE FIXED SIZE AND REMOVE FUNCTION TAKES O(N)
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public boolean isEmpty() {
            return rear == -1; //if none elements are present
        }

        //enqueue
        public  void add(int data){
            if(rear == size-1){
                System.out.println("full queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //dequeue
        public int remove(){ //TIME COMPLEXITY IS O(N)
            if(rear == size-1){
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i = 0 ; i < rear ; i++){
                arr[i] = arr[i+1];
            }
            rear--; //since all elements are shifted left, rear also has to be moved right
            return front;
        }

        public  int peek(){
            if(rear == size-1){
                return -1;
            }
            return arr[0];
        }


    }
    public static void main(String[] args) {
        Queue queue = new Queue(4);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("peek = " + queue.peek());
        queue.remove();
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }

    }
}
