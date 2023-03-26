package h1_19;

import java.util.Comparator;

public class Check implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b)
    {
        return b.grade - a.grade;
    }
}
