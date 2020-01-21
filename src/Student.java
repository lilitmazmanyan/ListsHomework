import java.util.ArrayList;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    String firstName;
    String lastName;
    int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " is " + age + " years old.";
    }

    @Override
    public int compareTo(Student student) {
        return this.firstName.compareTo(student.firstName);
    }

}
