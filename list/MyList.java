package list;


public class MyList {
    private Node head;
    private Node last;
    private int numNodes;

    public MyList() {
        head.next = null;
        head.previous = null;
        last.next = null;
        last.previous = null;
    }

    public void pushBack(Object item) {
        if (null == head) {
            head =  new Node(item);
            last = head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.previous = last;
            temp.next = new Node(item);
            last = temp;
            last.next = head;
        }
        numNodes++;
    }

    public void insertFirst(Object item) {
        if (null == head) {
            head = new Node(item);
            last = head;
        } else {
            Node temp = head;
            head = new Node(item);
            head.next = temp;
            head.previous = last;
        }
        numNodes++;
    }

    public void insertLast(Object item) {
        if (null == last) {
            last = new Node(item);
            head = last;
        } else {
            Node temp = last;
            last = new Node(item);
            last.previous = temp;
            last.next = head;

        }
        numNodes++;
    }

    public void insertAfterNode(Object nodeValue) {
        if (null == head) {
            return;
        }
        Node temp = last;
        do {
            temp = temp.next;
        } while (temp.getValue() != nodeValue);
        Node newTemp = temp.next;
        Node newNode = new Node(nodeValue);
        temp.next = newNode;
        newNode.next = newTemp;
        newNode.previous = temp;
        numNodes++;
    }

    public void deleteByNode(Node node) {
        if (null == head) {
            return;
        }
        Node temp = head;
        while (node != temp) {
            temp = temp.next;
        }
        temp.previous.next = temp.next;
        temp.next.previous = temp.previous;
        temp = null;
        numNodes--;
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

    public void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.getValue());
            temp = temp.next;
        }
    }

    public int getSize()
    {
        return numNodes;
    }

}
