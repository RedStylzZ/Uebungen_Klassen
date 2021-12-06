import model.Student;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(25, 2, "Tizian");
        Student student2 = new Student(24, 18, "Nico");
/*
        student.setAge(21);
        student.setSemester(5);
        student.setName("Tizian");
        */

        System.out.println(student1.equals(student2));
    }

}
