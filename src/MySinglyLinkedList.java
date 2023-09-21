package prelim;

/*
Name : Liquigan, Ralph Aloven A
DATA Structure
Individual Activity C
18/09/2023
 */
public class MySinglyLinkedList <T>{
    // Define the head and tail of the LinkedList
    Node <T> head = null;
    Node <T> tail = null;
    class Node<T> {
        private T element;
        private Node <T> next;

        public Node(T data){
            this.element = data;
            this.next = null;
        }

        public T getData() {
            return element;
        }

        public void setNext(Node <T> node) {
            this.next = node;
        }

        public Node<T> getNext() {
            return next;
        }
    }
    //Insert Data in the Node
    public void InsertData(T data){
        Node <T> newNode = new Node<T>(data);
        //Check if the Head of the LinkedList is Null
        if (head == null){
            //If the List is Empty, then create a new Node
            head = newNode;
            tail = newNode;
        } else {
            //If the given list has a data on a certain node
            //Then , Make an newNode after the Node
            tail.next = newNode;
            tail = newNode;
        }
    }

    //Displays the Linked List
    public void displayList(){
        Node <T> pointer = head;

        //If the head has no data, then inform the user that the List is empty
        if(head == null){
            System.out.println("The LinkedList is Empty");
            return;
        }
        //If the List has data, print the data
        System.out.print("Data that is stored in Singly Linked List are: ");
        while(pointer != null){
            System.out.print(pointer.getData()+" ");
            pointer = pointer.next;
        }
        System.out.println();
    }

    //Delete an Node in the LinkedList
    public void deleteNode(){

    }
}
