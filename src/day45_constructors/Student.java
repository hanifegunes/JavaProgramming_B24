package day45_constructors;

public class Student {
    String name;
    int batchNumber;
    double grade;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", batchNumber=" + batchNumber +
                ", grade=" + grade +
                '}';
    }
}
