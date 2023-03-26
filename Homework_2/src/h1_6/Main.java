package h1_6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address teacherAddress = new Address("Raului", 123, "Craiova");
        Address studentAddress = new Address("Pelendava", 456, "Bucuresti");
        Teacher teacher1 = new Teacher("Popescu Mihai", teacherAddress, "Calculus");
        Teacher teacher2 = new Teacher("Mihaescu Mihai", teacherAddress, "Mathematics");
        Student student1 = new Student("Necsulea Adrian", studentAddress, 1, "Computer Science");
        Student student2 = new Student("Ricea Alexandra", studentAddress, 2, "Electrical Engineering");
        Course course1 = new Course("Calculus", teacher1);
        course1.addStudent(student1);
        course1.addStudent(student2);
        System.out.println(course1);
        System.out.println(teacher1);
        ArrayList<Student> students=new ArrayList<>();
        students = course1.getStudents();
        System.out.println();
        System.out.println("Students: ");
        for (Student student : students) {
            System.out.println(student);
        }
        course1.removeStudent((Student) student1);
        Course newCourse = new Course("Calculus", teacher1);
        newCourse = newCourse.createNewCourse("Mathematics", teacher2);
        ArrayList<Student> newStudents = new ArrayList<>();
        newCourse.addStudent(student1);
        newCourse.addStudent(student2);
        System.out.println(newCourse);
    }
}
