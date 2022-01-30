package day30_array_strings;

public class MiddleInArrays {
    public static void main(String[] args) {

        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil", "Portugal",  "Turkey",
                "Philippines",   "Armenia",  "Colombia",  "Honduras",

    };

        for (String country : countries ){

            int mid = country.length()/2;

            if(country.length() % 2 == 0){
                // two middle character
               // int mid = country.length()/2;
                System.out.println(country.substring(mid-1,mid+1));

                System.out.println(country.substring(country.length()/2-1,country.length()/2+1));

                 // with charAt

                System.out.println("=========");
                System.out.println(country.charAt(mid-1)+ " "+country.charAt(mid));

            }else {
                // one mid character odd
                System.out.println("...................");
                System.out.println(country.charAt(mid));



            }

        }

     /*
        for (int i = 0; i<countries.length; i++ ){
            //String country = countries[i];

            int mid = countries[i].length()/2;

            if(countries[i].length() % 2 == 0){
                // two middle character
                // int mid = country.length()/2;
                System.out.println(countries[i].substring(mid-1,mid+1));

                System.out.println(countries[i].substring(countries[i].length()/2-1,countries[i].length()/2+1));

                // with charAt

                System.out.println("=========");
                System.out.println(countries[i].charAt(mid-1)+ " "+countries[i].charAt(mid));

            }else {
                // one mid character odd
                System.out.println("...................");
                System.out.println(countries[i].charAt(mid));


            }}
*/


            }
}
