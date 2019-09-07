package vector;

public class MyVector {
    private Object[] vector;
    private int size = 0;
    private int vectorInitialSize = 1;

    public MyVector() {
        vector = new Object[vectorInitialSize];
    }

    private void resizeIfNeeded() {
        if (size >= vectorInitialSize) {
            Object[] temp = vector;
            vector = new Object[2*vectorInitialSize];
            for (int i = 0; i < vectorInitialSize; i++){
                vector[i] = temp[i];
            }
            vectorInitialSize *= 2;
        }
    }

    public void pushBack(Object item) {
        resizeIfNeeded();
        vector[size] = item;
        size++;
    }

    public void pushFront(Object item) {
        resizeIfNeeded();
        for (int i = size; i <= 1 ; i--) {
            vector[i] = vector[i-1];
        }
        vector[0] = item;
        size++;
    }

    public void insertAtIndex(Object item, int index) {
        if (index > size) {
            return;
        }
        Object[] newVector = new Object[vectorInitialSize + 1];
        for (int i = 0; i < index; i++){
            newVector[i] = vector[i];
        }
        for (int i = index; i < vectorInitialSize; i++){
            newVector[i+1] = vector[i];
        }
        newVector[index] = item;
        vector = newVector;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }
        for (int i = index - 1; i < size; i++) {
            vector[i] = vector[i + 1];
        }
        size--;
    }

    public void printVector() {
        for (int i = 0; i < size; i++) {
            System.out.println(vector[i]);
        }
    }
}
