package prelim;

import java.util.LinkedList;

/*
Name : Liquigan, Ralph Aloven A
DATA Structure
Individual Activity D
18/09/2023
 */
public class MyDoublyLinkedList<T> {
    // Define the head and tail of the LinkedList
    Node<T> head = null;
    Node<T> tail = null;

    class Node<T> {
        private T element;
        private Node<T> next;
        private Node<T> previous;
        public Node(T data){
            this.element = data;
            this.next = null;
            this.previous = null;
        }

        public T getData() {
            return element;
        }

        public void setNext(Node<T> node) {
            this.next = node;
        }
        public void setPrevious(Node<T> node){
            this.previous = node;
        }

        public Node<T> getNext() {
            return next;
        }

        public Node<T> getPrevious() {
            return previous;
        }
    }
    //Insert Data in the Head
    public void InsertDataHead(T data){
        Node<T> newNode = new Node<T>(data);
        //Check if the Head of the LinkedList is Null
        if (head == null){
            //If the List is Empty, then create a new Node
            head = newNode;
            tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            //If the given list has a data on a certain node
            //Then , Make an newNode after the Node
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    //Insert data in the Tail
    public void InsertDataTail(T data){
        Node<T> newNode = new Node<T>(data);
        if(tail == null){
            tail.next = newNode;
        }
        tail = newNode;
        if(head == null){
            head = newNode;
        }
    }

    //Displays the Linked List
    public void displayList(){
        Node<T> pointer = head;

        //If the head has no data, then inform the user that the List is empty
        if(head == null){
            System.out.println("The LinkedList is Empty");
            return;
        }
        //If the List has data, print the data
        System.out.println("Data that are stored in Doubly Linked List are: ");
        while(pointer != null){
            System.out.print(pointer.getData()+ " ");
            pointer = pointer.next;
        }
        System.out.println();
    }
    //Display the List backwards
    public void displayListIterated(){
        //Points the direction of the pointer
        Node<T> pointer = tail;

        //If the head has no data, then inform the user that the List is empty
        if(tail == null){
            System.out.println("The LinkedList is Empty");
            return;
        }
        //If the List has data, print the data
        System.out.println("Data that are stored in Doubly Linked List are: ");
        while(pointer != null){
            System.out.print(pointer.getData()+ " ");
            pointer = pointer.previous;
        }
        System.out.println();
    }
}
