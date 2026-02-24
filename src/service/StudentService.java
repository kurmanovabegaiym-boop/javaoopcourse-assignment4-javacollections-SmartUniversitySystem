package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        students.add(new Student(1, "Alice", 3.8));
        students.add(new Student(2, "Bob", 1.9));
        students.add(new Student(3, "Charlie", 3.5));
        students.add(new Student(4, "David", 2.1));
        students.add(new Student(5, "Eva", 3.9));
    }

    public void removeLowGPA() {
        students.removeIf(s -> s.getGpa() < 2.0);
    }

    public void findHighestGPA() {
        Student top = students.get(0);
        for (Student s : students) {
            if (s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        System.out.println("Highest GPA: " + top);
    }

    public void insertAtIndex() {
        students.add(2, new Student(6, "New Student", 3.2));
    }

    public void printStudents() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}