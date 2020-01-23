import java.util.Arrays;

public class MyLinkedList{
    private Node first;
    private Node last;
    private int size;

    void push(Student student) {
        // inserts the student at the front of the list.
        Node n = new Node(student);
        if (first == null) {
            last = n;
        } else {
            first.setPrevious(n);
            n.setNext(first);
        }
        first = n;
        size++;
    }

    public Student pop() {
        // removes and returns the first student of the list
        if (size == 0) return null;

        Node removedNode = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.setPrevious(null);
        }
        first = first.next;
        size--;
        removedNode.setNext(null);
        return removedNode.data;
    }

    boolean addLast(Student student) {
        //appends the specified student to the end of the list.
        Node node = new Node(student);
        if (last != null) {
            first = node;
        } else {
            last.setNext(node);
            node.setPrevious(last);
        }
        last = node;
        size++;
        return true;
    }

    public Student removeLast() {
        //removes and returns the last student.
        if (size == 0)
            return null;

        Node removedNode = last;
        if (last.previous == null) {
            first = null;
        } else {
            last.previous.setNext(null);
        }
        last = last.previous;
        size--;
        removedNode.setNext(null);
        return removedNode.data;
    }

    int size() {
        return size;
    }

    public void printStudents() {
        System.out.println("Printing students");
        Node current = first;
        while (current != null) {
            current.printData();
            current = current.next;
        }
    }
}