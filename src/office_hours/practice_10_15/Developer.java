package office_hours.practice_10_15;

public class Developer {
    /*
     Attributes:
                        instance: name, employee id, job title, salary
                        static: can code (boolean)

                    Constructor:
                        - accepts and sets all instance variables
                        - overload to also create an object with only the name and employee id

                    Actions:
                        coding(),  fixingBug(), toString()

     */
    String name;
    String employeeId;
    String jobTitle;
    double salary;


    static boolean canCode;
    static {
        canCode = true;
    }




    public  Developer(String name,String employeeId) {
        this.name = name;
        this.employeeId = employeeId;

    }

    public  Developer(String name,String employeeId,String job,String title,double salary,boolean canCode) {
        this(name, employeeId);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;

        this.salary = salary;


    }
    public  void fixingBug(){
        System.out.println(name+" is fixing bug");

    } public  void coding(){
        System.out.println(name+" is coding");

    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
