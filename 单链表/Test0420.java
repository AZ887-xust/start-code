

public class Test0420 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(3);
        linkedList.addLast(2);

        linkedList.display();
        /*System.out.println(linkedList.contains(2));
        System.out.println(linkedList.size());*/
        linkedList.addIndex(3,4);
        linkedList.display();
    }
}
