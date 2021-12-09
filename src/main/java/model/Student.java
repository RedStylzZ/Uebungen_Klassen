package model;

import java.util.Objects;
import java.util.UUID;

public class Student {

    private final UUID uuid = UUID.randomUUID();
    private String name;
    private int age;
    private int semester;

    public Student(int age, int semester, String name) {
        this.age = age;
        this.semester = semester;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return uuid == student.uuid && age == student.age && semester == student.semester && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, name, age, semester);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + uuid +
                ", age=" + age +
                ", semester=" + semester +
                '}';
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
    public UUID getUUID() {
        return this.uuid;
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


}
