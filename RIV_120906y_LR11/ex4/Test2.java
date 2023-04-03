package lr11.RIV_120906y_LR11.ex4;

public class Test2 {
    public static void main(String[] args) {
        // добавление элементов с перемещением головы (наращивание с головы)
        Node head = null; // начальное значение ссылки на голову

        for(int i=9;i>=0;i--){
            head = new Node(i, head);
        }

        // вывод элементов на экран
        Node ref = head;
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
