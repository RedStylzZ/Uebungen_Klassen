import model.Student;
import model.StudentDB;

import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws InvalidKeyException {
        Student student1 = new Student(25, 2, "Tizian");
        Student student2 = new Student(24, 3, "Nico");
        Student student3 = new Student(45, 8, "Steven");
        Student student4 = new Student(76, 9, "Ronja");
        Student student5 = new Student(16, 6, "Turtle");
        Student student6 = new Student(1, 1, "Added");


//        StudentDB studentDB = new StudentDB(new ArrayList<Student>(List.of(student1, student2, student3, student4, student5)));
        StudentDB studentDB = new StudentDB(new HashMap<UUID, Student>(Map.of(
                student1.getUUID(), student1,
                student2.getUUID(), student2,
                student3.getUUID(), student3,
                student4.getUUID(), student4,
                student5.getUUID(), student5)));
        Map<UUID, Student> students = studentDB.list();
        System.out.println(students.get(student1.getUUID()));
        System.out.println();
        System.out.println("toString " + studentDB);
        studentDB.add(student6);
        System.out.println("Added " + studentDB);
        studentDB.remove(student3);
        System.out.println("Removed " + studentDB);
        System.out.println("Random " + studentDB.randomStudent());
    }

}
