package model;

import java.util.*;

public class StudentDB {

//    private Student[] students;
//    private List<Student> students;
    private final Map<Integer, Student> students;

    /*public StudentDB(List<Student> students) {
        this.students = students;
    }*/
    /*public void add(Student student) {
        students = Arrays.copyOf(students, students.length+1);
        students[students.length-1] = student;
    }*/

    public StudentDB(Map<Integer, Student> students) {
        this.students = students;
    }

    public void add(Student student) {
        this.students.put(student.getId(), student);
    }

    public void remove(Student student) {
        this.students.remove(student.getId());
    }
/*
    public void remove(Student student) {
        Student[] newStudents;

        for (int x = 0; x<= students.length-1; x++) {
            if (student.equals(students[x]))
            {
                newStudents = Arrays.copyOfRange(students, 0, x);
                newStudents = Arrays.copyOf(newStudents, students.length-1);
                if(newStudents.length >= x+1) {
                    System.arraycopy(students, x+1, newStudents, x, newStudents.length-1);
                }
                students = Arrays.copyOf(newStudents, newStudents.length);
                return;
            }
        }
    }
*/

    public Map<Integer, Student> list() {
        return students;
    }

    public Student randomStudent() {
        return students.get((int)(Math.random() * students.size()));
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }


}
