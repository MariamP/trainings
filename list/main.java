package list;

public class main {
    public static void main(String [] args)
    {
        MyList ll = new MyList(10);
        System.out.println("list size is:::::" + ll.getSize());
        ll.add(4);
        System.out.println("list size is:::::" + ll.getSize());
        ll.add("5");
        System.out.println("list size is:::::" + ll.getSize());
        ll.add(true);
        System.out.println("list size is:::::" + ll.getSize());
        ll.printList();
        ll.deleteAtIndex(2);
        System.out.println("list size is:::::" + ll.getSize());
        ll.printList();
    }

}
