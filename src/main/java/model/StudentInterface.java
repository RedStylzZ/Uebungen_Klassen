package model;

import java.util.Objects;

public interface StudentInterface {

    @Override
    public boolean equals(Object o);

    @Override
    public int hashCode();

    public int getAge();
    public int getSemester();
    public String getName();

    public void setAge(int age);
    public void setSemester(int semester);
    public boolean setName(String name);

    @Override
    public String toString();

}
