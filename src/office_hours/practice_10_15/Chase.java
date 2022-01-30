package office_hours.practice_10_15;

public class Chase {
    public static void main(String[] args) {


        DeveloperScrumTeam.companyName = "Chase";
        DeveloperScrumTeam.ceo = "James Dimon";

        DeveloperScrumTeam team = new DeveloperScrumTeam("Rashid", "Mykata", 4);

       // Developer dev1 = new Developer("Sydea", 10, "Senior Dev", 200000);

       // team.addDeveloper(dev1);

       // Developer dev2 = new Developer("Irina", 11, "Senior Dev", 200000);

       // team.addDeveloper(dev2);

        Tester test1 = new Tester("James", 7, "SDET", 150000);

      // team.addTester(test1);

      //  team.addTester(new Tester("Nadir", 9, "RPA", 1_000_000));

        System.out.println(team);







        System.out.println();

        System.out.println(new DeveloperScrumTeam(4));



    }
}
