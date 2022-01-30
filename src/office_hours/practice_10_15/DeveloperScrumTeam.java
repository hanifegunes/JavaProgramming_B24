package office_hours.practice_10_15;

import office_hours.practice_10_20.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class DeveloperScrumTeam {
    /*

               Attributes:
                            PO, BA, SM,
                            all developers, all testers (ArrayLists)
                            sprintNumber

                    static: company name, ceo name

                Constructor:
                    - sets only the sprint number
                    - overload to set sprint number, the names of PO, BA, SM, and creates ArrayList objects

                Actions:

                   addTester(Tester tester): adds the given tester to the testers arraylist

                   addTesters(Tester[] testers): adds the given testers to the testers arraylist

                   addDeveloper(Developer developer): adds the given developer to the developers arraylist

                   addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

                   removeTester(long employeeID): removes the given tester from the testers arraylist

                   removeDeveloper(long employeeID): removes the developer from the developers arraylist

                   toString(): prints number of tester,& developers,  PO name, SM name, BA name
     */


    String productOwner;
    String scrumMaster;
    int sprintNumber;
    //String companyName;
    ArrayList<Developer> allDevelopers;
    ArrayList<Tester> allTesters;

    static String companyName;
    static String ceo;

    public DeveloperScrumTeam(int SprintNumber) {
        this.sprintNumber = sprintNumber;
        allDevelopers = new ArrayList<>();
        allTesters = new ArrayList<>();
    }

    public DeveloperScrumTeam(String productOwner, String scrumMaster, int sprintNumber) {  // ArrayList<Developer> allDevelopers
        this(sprintNumber);
        this.productOwner = productOwner;
        this.scrumMaster = scrumMaster;
       // this.allDevelopers.addAll(allDevelopers);


    }

                              // String name gibi
    public void addDeveloper(Developer developer) {
        allDevelopers.add(developer);

    }

    public void addDeveloper(Developer[] developers) {
        allDevelopers.addAll(Arrays.asList(developers));


    }
    public   void  addTester(Tester tester){
        allTesters.add(tester);

    }
    public  void removeTester(int employeeId){
      // allTesters.removeIf(each->each.employeeId==employeeId);
    }

    @Override
    public String toString() {
        return "DeveloperScrumTeam{" +
                "productOwner='" + productOwner + '\'' +
                ", scrumMaster='" + scrumMaster + '\'' +
                ", sprintNumber=" + sprintNumber +
                ", allDevelopers=" + allDevelopers +
                ", allTesters=" + allTesters +
                ", \nallDevelopers=" + allDevelopers +
                //", \nallTesters=" + allTesters +

                '}';
    }
}



