import java.util.List;

public class Testing {
    public static void main(String[] args) {
        Student s1 = new Student("James", "Bond", 43);
        Student s2 = new Student("Mark", "Levi", 59);

        MyLinkedList linkedListToTest = new MyLinkedList();

        linkedListToTest.push(new Student("James", "Bond", 43));
        linkedListToTest.push(s2);
        linkedListToTest.push(s1);
        linkedListToTest.push(new Student("Michael", "Jackson", 60));
//        linkedListToTest.addLast(new Student("cd", "cds", 32));

        linkedListToTest.printStudents();

        System.out.println(linkedListToTest.size());

        linkedListToTest.addLast(s2);

        System.out.println(linkedListToTest.size());


//        MyArrayList<Student> listToTest = new MyArrayList<>();
//
//        listToTest.add(new Student("Levon", "Mazmanyan", 43));
//        listToTest.add(new Student("Zara", "Ordyan", 42));
//        listToTest.add(new Student("Nune", "Mazmanyan", 15));
//
//        System.out.println("Current size is " + listToTest.size());
//
//        listToTest.add(s1);
//        listToTest.add(s2);
//
//        System.out.println("Size after adding 2 students is: " + listToTest.size());
//
//        listToTest.remove(s1);
//        System.out.println("Size after deliting James Bond is: " + listToTest.size());
//        System.out.println(listToTest.get(3) + "\n");
    }
}
