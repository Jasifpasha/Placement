package vit.placement.datastructure.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    public Queue<Integer> queue1 = new LinkedList<>();
    public Queue<Integer> queue2 = new LinkedList<>();

    public void push(int x){
        queue1.add(x);
    }

    public int size(){
        return queue1.size();
    }

    public int pop(){
        if(queue1.isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        while(queue1.size() != 1){
            int x = queue1.remove();
            queue2.add(x);
        }
        int y = queue1.remove();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return y;
    }

    public static void main(String[] args)
    {
        StackUsingQueue s = new StackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        int x = s.pop();
        System.out.println(x);

        x = s.pop();
        System.out.println(x);


        System.out.println(s.size());

        s.push(8);
        s.push(20);
        s.push(36);

        x = s.pop();
        System.out.println(x);

        x = s.pop();
        System.out.println(x);

        s.push(40);

        System.out.println(s.size());

        x = s.pop();
        System.out.println(x);

        x = s.pop();
        System.out.println(x);

        x = s.pop();
        System.out.println(x);

        x = s.pop();
        System.out.println(x);

        x = s.pop();
        System.out.println(x);

    }





}
