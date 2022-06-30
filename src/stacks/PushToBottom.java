package stacks;

import java.util.Stack;

public class PushToBottom {

    public static void pushAtBottom(int data, Stack<Integer> stk){
        if(stk.isEmpty()){
            stk.push(data);
            return;
        }
        int top = stk.pop();
        pushAtBottom(data,stk);
        stk.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        pushAtBottom(5,stk);


        while (!stk.isEmpty()){
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}
