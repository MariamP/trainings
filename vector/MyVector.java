package vector;

public class MyVector {
    private int[] vector;
    private int size = 0;
    private int vectorInitialSize = 3;

    public MyVector() {
        vector = new int[vectorInitialSize];
    }

    public MyVector(int item) {
        vector[size] = item;
        size++;
    }

    public void add(int item) {
        if (size >= vectorInitialSize) {
            int[] temp = vector;
            vector = new int[2*vectorInitialSize];
            for (int i=0; i< vectorInitialSize; i++){
                vector[i] = temp[i];
            }
            vectorInitialSize *=2;
        }
        vector[size] = item;
        size++;
    }

    public void insertAtIndex(int item, int index) {
        if (index>size) {
            return;
        }
        int temp = vector[index-1];
        for (int i=index-1; i < size; i++) {
            vector[i] = item;
            item = vector[i+1];
            vector[i +1] = temp;
        }
        size++;
    }

    public void printVector() {
        for (int i = 0; i < size; i++) {
            System.out.println(vector[i]);
        }
    }
}
