package list;

public class main {
    public static void main(String [] args)
    {
        MyList ll = new MyList();
        System.out.println("list size is:::::" + ll.getSize());
        ll.pushBack(4);
        System.out.println("list size is:::::" + ll.getSize());
        ll.pushBack("5");
        System.out.println("list size is:::::" + ll.getSize());
        ll.pushBack(true);
        System.out.println("list size is:::::" + ll.getSize());
        ll.printList();
        ll.deleteAtIndex(2);
        System.out.println("list size is:::::" + ll.getSize());
        ll.printList();
    }

}
