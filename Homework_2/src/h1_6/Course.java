package h1_6;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Course(String name, Teacher teacher) {
        students = new ArrayList();
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void removeTeacher() {
        this.teacher = null;
    }

    public void changeTeacherAddress(Address address) {
        teacher.setAddress(address);
    }

    public void changeStudentAddress(Student student, Address address) {
        student.setAddress(address);
    }

    public Course createNewCourse(String name, Teacher teacher) {
        Course course = new Course(name, teacher);
        this.name=name;
        for (Student student : students) {
            course.addStudent(student);
        }
        return course;
    }

    @Override
    public String toString() {
        return "Course\n" +
                "teacher: " + teacher +
                "\nstudents=" + students;
    }
}
