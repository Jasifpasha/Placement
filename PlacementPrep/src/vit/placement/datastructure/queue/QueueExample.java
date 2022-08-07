package vit.placement.datastructure.queue;

public class QueueExample {

    public static void main(String[] args) {

        IntegerQueue integerQueue = new IntegerQueue(5);

        integerQueue.enqueue(5);
        integerQueue.enqueue(3);
        integerQueue.enqueue(10);
        integerQueue.enqueue(12);

        integerQueue.display();

        int dequeueElement = integerQueue.dequeue();
        System.out.println(dequeueElement);
        dequeueElement = integerQueue.dequeue();
        System.out.println(dequeueElement);

        integerQueue.enqueue(6);
        integerQueue.enqueue(7);
        integerQueue.enqueue(12);

        dequeueElement = integerQueue.dequeue();
        System.out.println(dequeueElement);

        integerQueue.display();

        integerQueue.enqueue(22);
        integerQueue.enqueue(44);

    }

}
