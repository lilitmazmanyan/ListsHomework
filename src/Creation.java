import java.util.*;

public class Creation {
    public static void main(String[] args) {
        MyArrayList<Student> listToTest = new MyArrayList<>();
        listToTest.add(new Student("Levon", "Mazmanyan", 43));
        listToTest.add(new Student("Zara", "Ordyan", 42));
        listToTest.add(new Student("Nune", "Mazmanyan", 15));
        System.out.println("Current size is " + listToTest.size());
        Student s1 = new Student("James", "Bond", 43);
        Student s2 = new Student("Mark", "Levi", 59);
        listToTest.add(s1);
        listToTest.add(s2);
        System.out.println("Size after adding 2 students " + listToTest.size());
        System.out.println(listToTest.get(3));

        ArrayList<Student> studnetsList = new ArrayList();
        studnetsList.add(new Student("Lilit", "Mazmanyan", 19));
        studnetsList.add(new Student("Koj", "Polorchyan", 20));
        studnetsList.add(new Student("Mar", "Sargsyan", 36));
        studnetsList.add(new Student("Ani", "Vardanyan", 1));
        studnetsList.add(new Student("Gor", "Abgaryan", 80));

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(new Student("Nune", "Mazmanyan", 15));
        studentLinkedList.add(new Student("Ani", "Soghomonyan", 14));
        studentLinkedList.add(new Student("Sus", "Papikyan", 41));
        studentLinkedList.add(new Student("Tyom", "Avoyan", 10));

        Comparator<Student> comparatorForAge = new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                if (student.age < t1.age) {
                    return 28;
                } else if (student.age == t1.age) {
                    return 0;
                } else return -1;
            }
        };

        Comparator<Student> comparatorForNames = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.firstName.compareTo(s2.firstName);
            }
        };

        Collections.sort(studnetsList, comparatorForAge);
        System.out.println("Students sorted by their ages\n");
        for (Student s : studnetsList) {
            System.out.println(s);
        }
        System.out.println("------------------Break-Here------------------\n");

        System.out.println("Sorting students list by their names\n");
        Collections.sort(studnetsList, comparatorForNames);
        for (Student s : studnetsList) {
            System.out.println(s);
        }
        System.out.println("------------------Break-Here------------------\n");

        Collections.sort(studentLinkedList);
        System.out.println("Sorting students linked list by their names\n");
        for (Student s : studentLinkedList) {
            System.out.println(s);
        }
        System.out.println("------------------Break-Here------------------");
//
    }
}