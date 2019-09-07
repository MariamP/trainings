package vector;

public class main {

    public static void main(String[] args) {
        MyVector vector = new MyVector();
        vector.pushBack(123);
        vector.printVector();
        vector.insertAtIndex(234, 1);
        vector.printVector();
        vector.pushBack(17);
        vector.printVector();
        vector.pushBack(9);
        vector.printVector();
        vector.insertAtIndex(77,2);
        vector.printVector();

    }
}
