import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student = new Student();

    @Test
    void checkAge() {
        int age = 21;
        student.setAge(age);
        assertEquals(age, student.getAge());
    }

    @Test
    void checkAgeFalse() {
        int age = 21;
        student.setAge(age);
        assertNotEquals(22, student.getAge());
    }

    @Test
    void checkSemester() {
        int semester = 5;
        student.setSemester(semester);
        assertEquals(semester, student.getSemester());
    }

    @Test
    void checkSemesterFalse() {
        int semester = 5;
        student.setSemester(semester);
        assertNotEquals(6, student.getSemester());
    }

    @Test
    void checkName() {
        String name = "Tizian";
        assertTrue(student.setName(name));
        assertEquals(name, student.getName());
    }

    @Test
    void checkNameFalse() {
        String name = "Tizian";
        assertFalse(student.setName(null));
        assertNotEquals("name", student.getName());
    }
}