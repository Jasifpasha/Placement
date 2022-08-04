package vit.placement.datastructure.stack;// Stack implementation in Java

public class IntegerStack {

    // store elements of stack
    private int arr[];
    // represent top of stack
    private int top;
    // total capacity of the stack
    private int capacity;

    // Creating a stack
    IntegerStack(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    // push elements to the top of stack
    public void push(int x) {
        if(isFull()){
            throw new RuntimeException("Stack is full. You cannot add element");
        }
        top++;
        arr[top] = x;
    }

    // pop elements from top of stack
    public int pop() {
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        int a = arr[top];
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

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.print("Stack: ");
        stack.display();
        int peekelement = stack.peek();
        System.out.println("Peek Element: " + peekelement);

        // remove element from stack
        stack.pop();
        System.out.println("\nAfter popping out");

        peekelement = stack.peek();
        System.out.println("Peek Element: " + peekelement);

        stack.display();

    }
}
