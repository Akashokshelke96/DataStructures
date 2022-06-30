package queue;

public class CircularQueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;


        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1; //if none elements are present
        }
        public boolean isFull(){
            return  (rear + 1)%size == front;
            }

        //enqueue
        public  void add(int data){
            if(isFull()){
                System.out.println("full queue");
                return;
            }
            //for first element add
            if(front == -1){
                front++;
            }
            rear = (rear + 1) % size; //rear pointer shifted to front of the array empty space
            arr[rear] = data;
        }

        //dequeue
        public int remove(){ //TIME COMPLEXITY IS O(N)
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front] ;

            //if single element condition
            if(rear == front){
                rear = front = -1;
            }
            else {
                front = (front+1) % size; //since all elements are shifted left, rear also has to be moved right
            }
            return result;
        }

        public  int peek(){
            if(rear == size-1){
                return -1;
            }
            return arr[front];
        }


    }
    public static void main(String[] args) {
        Queue queue = new Queue(4);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("peek = " + queue.peek());
        queue.remove();
        System.out.println("peek = " + queue.peek());
        queue.add(4);
        queue.add(6);





        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }

    }
}
