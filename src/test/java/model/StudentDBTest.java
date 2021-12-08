package model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
    Student student1 = new Student(25, 2, 1,"Tizian");
    Student student2 = new Student(24, 3, 2,"Nico");
    Student student3 = new Student(45, 8, 3,"Steven");
    Student student4 = new Student(76, 9, 4,"Ronja");
    Student student5 = new Student(16, 6, 5,"Turtle");
    Student student6 = new Student(1, 1, 6,"Added");

//    StudentDB studentDB = new StudentDB(List.of(new Student[]{student1, student2, student3, student4, student5}));
/*
    @Test
    void add() {
        studentDB.add(student6);
        assertEquals(student6, studentDB.list().get(5));
    }

    @Test
    void remove() {
        studentDB.remove(student2);
        assertNotEquals(student2, studentDB.list().get(0));
        assertEquals(4, studentDB.list().size());
    }

    @Test
    void list() {
    }

    @Test
    void testToString() {
    }*/
}