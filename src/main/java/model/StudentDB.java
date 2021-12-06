package model;

import java.util.Arrays;

public class StudentDB {

    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public void add(Student student) {
        students = Arrays.copyOf(students, students.length+1);
        students[students.length-1] = student;
    }

    public void remove(Student student) {
        Student[] newStudents;

        for (int x = 0; x<= students.length-1; x++) {
            if (student.equals(students[x]))
            {
                newStudents = Arrays.copyOfRange(students, 0, x);
                newStudents = Arrays.copyOf(newStudents, students.length-1);
                if(newStudents.length >= x+1) {
                    System.arraycopy(students, x+1, newStudents, x, newStudents.length);
                }
                students = Arrays.copyOf(newStudents, newStudents.length);
                return;
            }
        }

    }

    public Student[] list() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    public Student randomStudent() {
        return students[(int)(Math.random() * students.length)];
    }

}
