package model;

import java.util.Objects;

public class Student {

    private int age;
    private int semester;
    private String name;

    public Student(int age, int semester, String name) {
        this.age = age;
        this.semester = semester;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public int getSemester() {
        return semester;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    public boolean setName(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }
        this.name = name;
        return true;
    }

    @Override
    public String toString() {
        return "Student " + this.name +
                "\nis " + this.age + " years old" +
                "\nand is in semester " + this.semester;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && semester == student.semester && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, semester, name);
    }
}
