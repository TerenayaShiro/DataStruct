package prelim;

import java.util.NoSuchElementException;
import java.util.Arrays;

public class MyGrowingArrayList <E> implements MyList <E>{
    private Object[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 5;

    public MyGrowingArrayList() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void insert(E data) {
        if (size == array.length) {
            // Resize the array by creating a new one with double the capacity
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
        array[size] = data;
        size++;
    }

    @Override
    public E getElement(E data) throws NoSuchElementException {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return (E) array[i];
            }
        }
        throw new NoSuchElementException("Element not found in the list.");
    }

    @Override
    public boolean delete(E data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                // Shift elements to the left to fill the gap
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int search(E data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }
}
