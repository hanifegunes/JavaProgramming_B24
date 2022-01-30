package office_hours.practice_10_13;

import java.util.ArrayList;
import java.util.Arrays;
public class ScrumTeam {
    String productOwner, scrumMaster;
    int sprintNumber; // it is a unique
    ArrayList<Developer> allDeveloper;// reference not an object // store developer object
    ArrayList<Tester> allTester;

    static String companyName;
    static String ceo;

    public ScrumTeam(int sprintNumber) {
        this.sprintNumber = sprintNumber;
        allDeveloper = new ArrayList<>();
      // allTester = new ArrayList<>();// create object with new keywords
    }

    public ScrumTeam(String productOwner, String scrumMaster, ArrayList<Developer> developers,ArrayList<Tester> testers,int sprintNumber) {
        this(sprintNumber);
        this.productOwner = productOwner;

        this.scrumMaster = scrumMaster;
        this.allDeveloper.addAll(allDeveloper);


    }
    public void addDeveloper(Developer developer){// class   reference // Developer data type like string
        allDeveloper.add(developer);

    }
    public void addDeveloper(Developer[] developers){

        allDeveloper.addAll(Arrays.asList(developers));
    }

    public void addTester(Tester [] tester){
        // allTester.add(tester);
        for(Tester eachTester: tester){
            allTester.add(eachTester);
        }
         }

         public  void  allDeveloper(Developer [] developerList){
        for(Developer eachDeveloper: developerList ){
            allDeveloper.add(eachDeveloper);
        }
         }

        //public void removeTester(int employeeId){
            //   allTester.removeIf(each -> each.employeeId == employeeId);
       // }


   // }
    public  void  removeDeveloper(Developer developer){
      //  AllDevelopers.remove(developer);
       // for(Developer eachDeveloper: AllDeveloper){
           // allDeveloper.add(eachDeveloper);
        }
//    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner='" + productOwner + '\'' +
                ", scrumMaster='" + scrumMaster + '\'' +
                ", sprintNumber=" + sprintNumber +
                ", allDeveloper=" + allDeveloper +
                '}';
    }



    }

    /*
create a class called ScrumTeam
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
