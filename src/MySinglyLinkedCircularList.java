package prelim;

public class MySinglyLinkedCircularList <T> {
    // Define the head and tail of the LinkedList
    Node<T> head = null;
    Node<T> tail = null;

    class Node<T> {
        private int Size;
        private T element;
        private Node<T> next;

        public Node(T data){
            this.element = data;
            this.next = null;
            Size = 0;
        }

        public T getData() {
            return element;
        }

        public void setNext(Node<T> node) {
            this.next = node;
        }

        public Node<T> getNext() {
            return next;
        }

        public int getSize() {
            return Size;
        }
        public int setSize(int Size){
            return this.Size = Size;
        }
    }

    // Determine the Size of the LinkedList
    public int getSizeList(){
        Node <T> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        //return the count of the loop as a Size of the LinkedList
        return count;
    }
    //Insert Data in the Node
    public void InsertFirst(T data){
        Node<T> newNode = new Node<T>(data);
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
    //Inserts Node in a certain Position of the LinkedList
    public void insertIndexAt(int Position, T data){
        Node<T> newNode = new Node<>(data);
        Node<T> Head = head;
        Position = Position - 1;

        for (int i=0; i <= getSizeList() ; i++) {
            if (i == Position) {
                Head.next = newNode.next;
                newNode.next = Head;
            } else {
                newNode = newNode.next;
            }
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
