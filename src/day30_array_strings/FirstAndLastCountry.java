package day30_array_strings;

public class FirstAndLastCountry {
    public static void main(String[] args) {

        String [] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia",  "United States", "Russia" };


        for(int i = 0; i< countries.length; i++){

            String each = countries[i].toUpperCase();
            System.out.println("name of countries "+ each);
            System.out.println("first character is "+each.charAt(0) );
            System.out.println("last character is "+ each.charAt(each.length()-1));

            System.out.println("-------------");


        } // for each loop
        for( String each : countries){
            each = each.toUpperCase();
            System.out.println("name of countries "+ each);
            System.out.println("first character is "+each.charAt(0) );
            System.out.println("last character is "+ each.charAt(each.length()-1));
            System.out.println("===================");



        }



    }
}
