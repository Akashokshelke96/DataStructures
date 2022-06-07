package resizableArray;

public class ResizableArray {
    //this way we can nullify the drawback of ARRAY that its not resizeable
    private Integer[] arr;
    private int size;
    private int capacity;

    public ResizableArray() {
        this.arr = new Integer[2];
        this.size = 0;
        this.capacity = 2;
    }
//this is method to add new element to the back of the the array
    public void push(int elementToPush) {
        if (size < capacity) {
            arr[size] = elementToPush;
            size++;
        } else {
            Integer[] newArr = new Integer[capacity*2];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            capacity = capacity * 2;
            newArr[size] = elementToPush;
            size++;
            this.arr = newArr;
        }

    }
//method to print the array
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

    }
}