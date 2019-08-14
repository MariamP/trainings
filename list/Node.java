package list;

public class Node {
    public Node next;
    private Object item;

    public Node(Object item)
    {
        this.item = item;
    }

    public Object getCurrentItem()
    {
        return item;
    }
}
