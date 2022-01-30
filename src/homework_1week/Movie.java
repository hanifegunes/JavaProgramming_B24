package homework_1week;

public class Movie {
    public static void main(String[] args) {

String name = "Titanic",
    genre ="Drama";

        String releaseDate = "08/24/2010";
        double $duration = 1.5;
        double rottenTomatoesRating = 98.8;
        double rating = 5;
        short day= 24,
                month=8;
            int year = 2010;
            boolean isSequels = false,
                    isDvd= true;

        System.out.println("\t\t\t"+ name +"\nGenre:\t" +genre +"\nRelease Date:\t"+releaseDate+ "\nRating:\t\t\t"+ rottenTomatoesRating+ "\nIs on DVD:\t\t"+ isDvd +"\nIs a squel?\t\t"+isSequels);

        System.out.println("*************************************************");
        System.out.println("\t\tTonight we are streaming \""+name+"\" which was released on  " + releaseDate +"\n\tThis  "+genre +" movie got a "+ rottenTomatoesRating+" rating on Rotten Rating Tomatoes. " +"\n\tThe rating is "+ rating+ " and it runs for  "+ $duration +"hours."+"\n\tThis is sequel "+ isSequels +" and is on DVD.");
        System.out.println("**************************************************");









    }
}
