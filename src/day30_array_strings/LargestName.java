package day30_array_strings;

public class LargestName {
    public static void main(String[] args) {
        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines Nation", "UAE", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States", "Russia"};

        String smallest = countries[0];
        String largest = countries[0];

        for(String each : countries){

            if(each.length() < smallest.length()){
                smallest = each;
            }

            if(each.length() > largest.length()){
                largest = each;
            }

        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

    }
}
