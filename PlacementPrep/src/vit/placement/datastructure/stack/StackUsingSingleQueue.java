package vit.placement.datastructure.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {

    public Queue<Integer> queue1 = new LinkedList<>();

    public void push(int x){
        queue1.add(x);
        for (int i = 0; i < queue1.size() - 1; i++) {
            queue1.add(queue1.remove());
        }
    }

    public int size(){
        return queue1.size();
    }

    public int pop(){
        if(queue1.isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return queue1.remove();
    }

    public static void main(String[] args)
    {
        StackUsingSingleQueue s = new StackUsingSingleQueue();
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
