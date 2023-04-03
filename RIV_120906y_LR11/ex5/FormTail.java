package lr11.RIV_120906y_LR11.ex5;

public class FormTail {
    public static void main(String[] args) {
        Node head = new Node(0, null);

        for(int i=1;i<=9;i++) head = new Node(i, head);

        Node ref = head;
        while(ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
