package day45_constructors;

public class Employee {
    /*
      create a class called Employee

        - data:

            name, id, job title, salary

        - constructor

            should have 4 parameters, one for each instance variable

            parameter names need to be unique

                name -> inputName

                WRONG X con(name, id, title, salary)

                DO it -> con(inputName, inputId, inputTitle, inputSalary)

            initialize the instance variables

        - method:

            goToMeeting()
                when this method is called print:
                    $name is going to a meeting

            toString()
                print all the employees information


     */
    String nameOne;
    int id;
    String jobTitle;
    double salary;

    public  Employee(String str, int num, String str2, double db){
    str =  nameOne;
    num =id;
    str2 = jobTitle;
    db = salary;


    }
    public  void  goToMeeting(){
        System.out.println(nameOne + " is going to meeting");
    }


    @Override
    public String toString() {
        return "Employee{" +
                "nameOne='" + nameOne + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
