package list;

public class Node {
    public Node next;
    public Node previous;
    private Object item;

    public Node(Object item)
    {
        this.item = item;
    }

    public Object getValue()
    {
        return item;
    }
}
