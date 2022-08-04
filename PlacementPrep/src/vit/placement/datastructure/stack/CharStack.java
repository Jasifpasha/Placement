package vit.placement.datastructure.stack;// Stack implementation in Java

public class CharStack {

    // store elements of stack
    private char arr[];
    // represent top of stack
    private int top;
    // total capacity of the stack
    private int capacity;

    // Creating a stack
    public CharStack(int size) {
        arr = new char[size];
        top = -1;
        capacity = size;
    }

    // push elements to the top of stack
    public void push(char x) {
        if(isFull()){
            throw new RuntimeException("Stack is full. You cannot add element");
        }
        top++;
        arr[top] = x;
    }

    // pop elements from top of stack
    public char pop() {
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        char a = arr[top];
        top--;
        return a;
    }

    // return size of the stack
    public int getSize() {
        return top + 1;
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // display elements of stack
    public void display() {
        for (int i = 0; i <= top; i++){
            System.out.println(arr[i]);
        }
    }

    public int count() {
        return top + 1;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return arr[top];
    }
}
