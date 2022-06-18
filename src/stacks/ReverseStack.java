package stacks;

import java.util.Stack;

public class ReverseStack {
    public static void pushToBottom(int data, Stack<Integer> stk){
        //baseCase
        if(stk.isEmpty()){
            stk.push(data);
            return;
        }

        int top = stk.pop();
        pushToBottom(data,stk);
        stk.push(top);
    }

    public static void reverseStack(Stack<Integer> stk){

        if(stk.isEmpty()){
            return;
        }
        int top = stk.pop();
        reverseStack(stk);
        pushToBottom(top,stk);
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        reverseStack(stk);

        while (!stk.isEmpty()){
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}
