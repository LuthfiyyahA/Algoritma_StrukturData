public class NodeG15 {
    int data;
    NodeG15 prev, next;
    int jarak;

    NodeG15(NodeG15 prev, int data, int jarak, NodeG15 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}
