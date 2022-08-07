package vit.placement.datastructure.stack;

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int x) {
        stack1.push(x);
    }

    public int dequeue() {
        //Check if both stacks are empty, then q is empty
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Q is Empty");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                int x = stack1.pop();
                stack2.push(x);
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args){

        QueueUsingStack queueObj = new QueueUsingStack();

        queueObj.enqueue(1);
        queueObj.enqueue(5);
        queueObj.enqueue(10);
        int dequeueElement = queueObj.dequeue();
        System.out.println("Dequeued Element : " + dequeueElement);
        queueObj.enqueue(15);
        queueObj.enqueue(20);
        dequeueElement = queueObj.dequeue();
        System.out.println("Dequeued Element : " + dequeueElement);
        queueObj.enqueue(16);
        queueObj.enqueue(35);
        dequeueElement = queueObj.dequeue();
        System.out.println("Dequeued Element : " + dequeueElement);
        dequeueElement = queueObj.dequeue();
        System.out.println("Dequeued Element : " + dequeueElement);
        dequeueElement = queueObj.dequeue();
        System.out.println("Dequeued Element : " + dequeueElement);
        dequeueElement = queueObj.dequeue();
        System.out.println("Dequeued Element : " + dequeueElement);
        dequeueElement = queueObj.dequeue();
        System.out.println("Dequeued Element : " + dequeueElement);
        dequeueElement = queueObj.dequeue();
        System.out.println("Dequeued Element : " + dequeueElement);

    }


}
