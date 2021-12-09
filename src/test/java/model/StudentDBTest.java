package model;

import org.junit.jupiter.api.Test;

import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class StudentDBTest {
    Student student1 = new Student(25, 2, "Tizian");
    Student student2 = new Student(24, 3, "Nico");
    Student student3 = new Student(45, 8, "Steven");
    Student student4 = new Student(76, 9, "Ronja");
    Student student5 = new Student(16, 6, "Turtle");
    Student student6 = new Student(1, 1, "Added");

    StudentDB studentDB = new StudentDB(new HashMap<UUID, Student>(Map.of(
            student1.getUUID(), student1,
            student2.getUUID(), student2,
            student3.getUUID(), student3,
            student4.getUUID(), student4,
            student5.getUUID(), student5)));
    /*@Test
    void add() {
        studentDB.add(student6);
        assertEquals(student6, studentDB.list().get(5));
    }

    @Test
    void remove() {
        studentDB.remove(student2);
        assertNotEquals(student2, studentDB.list().get(0));
        assertEquals(4, studentDB.list().size());
    }*/

    @Test
    void checkAddException() {
        try {
            studentDB.add(student6);
        } catch (InvalidKeyException e) {
            System.out.println("O.o  " + e);
        }
    }

    @Test
    void list() {
    }

    @Test
    void testToString() {
    }

}
