import model.Student;
import model.StudentDB;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(25, 2, 1,"Tizian");
        Student student2 = new Student(24, 3, 2,"Nico");
        Student student3 = new Student(45, 8, 3,"Steven");
        Student student4 = new Student(76, 9, 4,"Ronja");
        Student student5 = new Student(16, 6, 5,"Turtle");
        Student student6 = new Student(1, 1, 6,"Added");


        StudentDB studentDB = new StudentDB(new Student[]{student1, student2, student3, student4, student5});
        Student[] students = studentDB.list();
        System.out.println(students[0]);
        System.out.println();
        System.out.println(studentDB);
        studentDB.add(student6);
        System.out.println(studentDB);
        studentDB.remove(student6);
        System.out.println(studentDB);
        System.out.println(studentDB.randomStudent());
    }

}
