package h1_19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Student student1=new Student("Necsulea Adrian", 100);
        Student student2=new Student("Ricea Alexandra", 95);
        Student student3=new Student("Vulea Catalin", 97);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Collections.sort(students, new Check());
        System.out.println(students);
    }
}
