package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student1 = new Student(25, 2, 1,"Tizian");
    Student student2 = new Student(24, 18, 2,"Nico");

    @Test
    void checkAge() {
        int age = 21;
        student1.setAge(age);
        assertEquals(age, student1.getAge());
    }

    @Test
    void checkAgeFalse() {
        int age = 21;
        student1.setAge(age);
        assertNotEquals(22, student1.getAge());
    }

    @Test
    void checkSemester() {
        int semester = 5;
        student1.setSemester(semester);
        assertEquals(semester, student1.getSemester());
    }

    @Test
    void checkSemesterFalse() {
        int semester = 5;
        student1.setSemester(semester);
        assertNotEquals(6, student1.getSemester());
    }

    @Test
    void checkName() {
        String name = "Tizian";
        assertTrue(student1.setName(name));
        assertEquals(name, student1.getName());
    }

    @Test
    void checkNameFalse() {
//        String name = "Tizian";
        assertFalse(student1.setName(null));
        assertNotEquals("name", student1.getName());
    }

    @Test
    void checkEqualsFunction() {
        assertEquals(student1, new Student(25, 2, 1,"Tizian"));
    }

    @Test
    void checkEqualsFunctionFalse() {
        assertNotEquals(student1, student2);
    }

}