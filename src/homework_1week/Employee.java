package homework_1week;

public class Employee {
    public static void main(String[] args) {
        String fName = "Hazel",
                lName= "Sunny",
                cName = "Sun Shine",
                jTittle = "Officer",
                oAddress = "302 Eagle st.",
                startMonth = "April";
        double salary = 100_000;


        double sMonth = 4,
                sYear = 2020,
                sDay = 23;
        System.out.println("\t\tEmployee Information " + "\nFull  Name:\t\t\t" +fName+ "" +lName + "\nCompany Name:\t\t" + cName +"\nJob Tittle: \t\t" + jTittle +"\nOffice Address:\t\t " + oAddress+ "\nStart Date " +sMonth +"/"+sDay+"/"+sYear +"Salary:\t" +salary +"\nEmail:"+fName+lName+ "@"+cName+".com" );

        double salaryAfterTwoYears = salary + 3*1000;

        System.out.println("\t\tEmployee Information " + "\nFull  Name:\t\t\t" +fName+ "" +lName + "\nCompany Name:\t\t" + cName +"\nJob Tittle: \t\t" + jTittle +"\nOffice Address:\t\t " + oAddress+ "\nStart Date " +sMonth +"/"+sDay+"/"+sYear +"Salary:\t" +salaryAfterTwoYears +"\nEmail:"+fName+lName+ "@"+cName+".com" );




    }
}
