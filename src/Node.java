class Node {
    Student data;
    Node next;
    Node previous;

    void setNext(Node next) {
        this.next = next;
    }

    void setPrevious(Node previous) {
        this.previous = previous;
    }

    Node(Student student) {
        this.data = student;

    }

    public void printData() {
        System.out.println(data);
    }
}
