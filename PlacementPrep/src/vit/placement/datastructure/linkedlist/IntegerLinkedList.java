package vit.placement.datastructure.linkedlist;

public class IntegerLinkedList {

    public IntegerNode head;

    public void insert(int x) {
        IntegerNode newNode = new IntegerNode(x);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int x){

        IntegerNode newNode = new IntegerNode(x);
        if(head == null) {
            head = newNode;
            return;
        }
        IntegerNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;

    }

    public void insertAtPosition(int x, int position){

        IntegerNode newNode = new IntegerNode(x);



    }

}
