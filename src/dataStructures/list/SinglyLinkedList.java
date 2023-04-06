package dataStructures.list;

public class SinglyLinkedList<T> {
    private SLNode<T> head;
    private int size = 0;

    public SinglyLinkedList() {
        head = new SLNode<>();
    }

    /**
     * Adds data to front of list.
     * @param data data to add
     */
    public void addFirst(T data) {
        if (size == 0) {
            head.data = data;
        } else {
            SLNode<T> add = new SLNode<>(data);
            add.next = head;
            head = add;
        }
        size++;
    }

    /**
     * Adds data to end of list.
     * @param data data to add
     */
    public void addLast(T data) {
        if (size == 0) {
            head.data = data;
        } else {
            SLNode<T> point = head;
            while(point.next != null) {
                point = point.next;
            }
            point.next = new SLNode<>(data);
        }
        size++;
    }

    /**
     * Adds data at index.
     * @param index ending position of added data
     * @param data data to add
     */
    public void add(int index, T data) {
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            SLNode<T> point = head;
            for (int i = 0; i < index - 1; i++) {
                point = point.next;
            }
            SLNode<T> add = new SLNode<>(data);
            add.next = point.next;
            point.next = add;
            size++;
        }
    }

    /**
     * Removes first occurrence of data from list.
     * @param data data to be removed
     * @return the data removed from list
     */
    public T remove(T data) {
        SLNode<T> point = head;
        while (point.next != null) {
            if (point.next.data.equals(data)) {
                point.next = point.next.next;
                size--;
                return data;
            }
            point = point.next;
        }
        return null;
    }

    /**
     * Returns the data at index.
     * @param index index of data to get
     * @return data at index
     */
    public T get(int index) {
        SLNode<T> point = head;
        for (int i = 0; i < index; i++) {
            point = point.next;
        }
        return point.data;
    }

    public int size() {
        return size;
    }


    public static void main(String[] args) {
        SinglyLinkedList<Integer> myList = new SinglyLinkedList<>();

        myList.addLast(5);
        myList.addLast(4);
        myList.addLast(3);
        myList.addFirst(2);
        myList.addFirst(1);
        myList.add(3, 100);
        System.out.println(myList.get(3));
        System.out.println(myList.remove(3));

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    private static class SLNode<T> {
        private SLNode<T> next;
        private T data;

        private SLNode() {   }

        SLNode(T data) {
            this.data = data;
            next = null;
        }
    }
}
