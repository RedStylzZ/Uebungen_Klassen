package model;

import java.util.Objects;

public class Student {

    private final int id;
    private String name;
    private int age;
    private int semester;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && semester == student.semester && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, semester);
    }

    public Student(int age, int semester, int id, String name) {
        this.age = age;
        this.semester = semester;
        this.id = id;
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
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", semester=" + semester +
                '}';
    }

}
