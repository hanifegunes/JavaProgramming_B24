package day45_constructors;

public class Employees {
    /*
     create a class called Employee

        - data:

            name, id, job title, salary
     */

    String name;
    int id;
    double salary;
    String jobTitle;
    /*
     - constructor

            should have 4 parameters, one for each instance variable

            parameter names need to be unique

                name -> inputName

                WRONG X con(name, id, title, salary)

                DO it -> con(inputName, inputId, inputTitle, inputSalary)

            initialize the instance variables
     */

    public Employees(String inputName, int inputId, String inputTitle, double inputSalary){
        name =inputName;
        id = inputId;
        jobTitle = inputTitle;
        salary = inputSalary;
    }

     public  void  gotoMeeting(){
        /*
         method:

            goToMeeting()
                when this method is called print:
                    $name is going to a meeting

            toString()
                print all the employees information
         */


         System.out.println(name + " is going to meeting");
     }

    @Override
    public String toString() {
        return "Employees{" +
                "name: '" + name + '\'' +
                ", id: " + id +
                ", salary: " + salary +
                ", jobTitle: '" + jobTitle + '\'' +
                '}';
    }
}
