package office_hours.practice_10_13;

public class Developer {
    String name;
    int employeeId;
    String jobTitle;
    double salary;

    static boolean canCode;

    static {
        canCode = true;
    }

    public Developer(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public Developer(String name, int employeeId, String jobTitle, double salary) {
        this(name, employeeId);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void fixingBug(){
        System.out.println(name + " is fixing a bug");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
create a class called Developer
                    Attributes:
                        instance: name, employee id, job title, salary
                        static: can code (boolean)
                    Constructor:
                        - accepts and sets all instance variables
                        - overload to also create an object with only the name and employee id
                    Actions:
                        coding(),  fixingBug(), toString()
 */

