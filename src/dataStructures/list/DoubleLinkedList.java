package dataStructures.list;

public class DoubleLinkedList<T> {
    private DLNode<T> head;
    private DLNode<T> tail;
    private int size = 0;

    public DoubleLinkedList() {
        head = new DLNode<>();
        tail = head;
    }

    public void addFirst(T data) {
        if (size == 0) {
            head.data = data;
        } else {
            DLNode<T> add = new DLNode<>(data);
            add.next = head;
            head = add;
        }
        size++;
    }

    public void add(int index, T data) {


        size++;
    }

    public void addLast(T data) {
        if (size == 0) {
            head.data = data;
        } else {
            DLNode<T> add = new DLNode<>(data);
            tail.next = add;
            add = tail;
        }
        size++;
    }

    public T remove(T data) {


        size--;
        return data;
    }

    public T get(int index) {
        return head.data;
    }

    public int size() {
        return size;
    }





    private static class DLNode<T> {
        private DLNode<T> next;
        private DLNode<T> prev;
        private T data;
        private DLNode() {   }
        private DLNode(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
