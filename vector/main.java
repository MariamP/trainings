package vector;

public class main {

    public static void main(String[] args) {
        MyVector vector = new MyVector();
        vector.add(123);
        vector.printVector();
        vector.insertAtIndex(234, 1);
        vector.printVector();
        vector.add(17);
        vector.printVector();
        vector.add(9);
        vector.printVector();
        vector.insertAtIndex(77,2);
        vector.printVector();

    }
}
