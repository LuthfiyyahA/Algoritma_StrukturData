public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.print();
        list.addFirst(111, "Anton");
        list.print();
        list.addLast(114, "Doni");
        list.print();
        list.insertAfter(111, 112, "Prita");
        list.print();
        list.insertAt(3, 115, "Sari");
        list.print();
    }
}