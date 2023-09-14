import org.w3c.dom.Node;

public class MySinglyLinkedList<T>{
    private T element;
    private Node next;
    public MySinglyLinkedList(String s, Node n){
        element = (T) s;
        next = n;
    }
    public T getElement(){
        return element;
    }
    public Node getNext(){
        return next;
    }
    public void setElement(T newElement){
        element = newElement;
    }
    public void setNext(Node newNext){
        next = newNext;
    }
}
