public class Student {

    private int age;
    private int semester;
    private String name;

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
}
