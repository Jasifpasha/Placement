package vit.placement.datastructure.queue;

public class IntegerQueue {

    int front;
    int rear ;
    int capacity;
    int[] arr ;
    int currentSize;

    public IntegerQueue(int size){
        front = 0;
        rear = -1;
        capacity = size;
        arr = new int[capacity];
        currentSize = 0;
    }

    public boolean isFull(){
        if(currentSize == capacity) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if(currentSize == 0){
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full");
        } else {
            if(rear == capacity - 1){
                rear = -1;
            }
            rear = rear + 1;
            arr[rear] = x;
            currentSize++;
        }
    }

    public int dequeue(){

        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        } else {
            int temp = arr[front];
            front++;
            if(front == capacity){
                front = 0;
            }
            currentSize--;
            return temp;
        }
    }

    public void display(){
        for(int i = 0; i < currentSize; i++){
            System.out.println(arr[(front + i) % capacity]);
        }
    }

}
