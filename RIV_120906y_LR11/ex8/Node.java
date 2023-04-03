package lr11.RIV_120906y_LR11.ex8;

public class Node
{
    public int value;
    public Node next;

    Node(int value, Node next)
    {
        this.value = value;
        this.next = next;
    }

    public void createHead(Integer value)
    {
        Node newNode = new Node(this.value, this.next);
        this.value = value;
        this.next = newNode;
    }

    public void createTail(Integer value)
    {

        Node newTail = new Node(value, null);
        Node ref = this;
        while (ref.next != null)
        {
            ref = ref.next;
        }
        ref.next = newTail;
    }

    public String toString()
    {
        StringBuilder ret = new StringBuilder();

        Node ref = this;

        do
        {
            ret.append(ref.value).append(" ");
            ref = ref.next;
        } while (ref != null);

        return ret.toString();
    }

    public void AddFirst(int value)
    {
        createHead(value);
    }

    public void AddLast(int value)
    {
        createTail(value);
    }

    public void Insert(int pos, int value)
    {
        Node newNode = new Node(value, null);
        Node ref = this;
        int k=1;
        while (ref.next!= null && (k < pos))
        {
            ref = ref.next;
            k++;
        }


        newNode.next = ref.next;
        ref.next = newNode;
    }

    public void RemoveFirst()
    {
        Node newHead = this.next;
        this.value = newHead.value;
        this.next = newHead.next;
        newHead.next = null;
    }

    public void RemoveLast()
    {
        Node ref = this;
        while (ref.next.next != null)
        {
            ref = ref.next;
        }

        ref.next=null;
    }

    public void Remove(int pos)
    {
        Node ref = this;
        int k = 1;
        while (ref.next != null && (k < pos))
        {
            ref = ref.next;
            k++;
        }
        assert ref.next != null;
        ref.next = ref.next.next;
    }
}
