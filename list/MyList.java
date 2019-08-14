package list;

public class MyList {
    private static Node head;
    private static int numNodes;

    public MyList(Object item)
    {
        head = new Node(item);
        numNodes++;
    }

    public void add(Object item)
    {
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = new Node(item);
        numNodes++;
    }

    public void deleteAtIndex(int index)
    {
        if(index + 1 > getSize()) {
            return;
        }
        Node temp = head;
        for(int i=0; i< index - 1 && temp.next != null; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public static void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.getCurrentItem());
            temp = temp.next;
        }
    }

    public static int getSize()
    {
        return numNodes;
    }

}
