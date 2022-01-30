package day13_if_statements;

public class Weather {
    public static void main(String[] args) {
      /* sunny, rainy, snowy,foggy, cloudy

       */
     String weather = "windy";
     if (weather. equals("sunny")){
         System.out.println("go outside");
     }else if (weather.equals("rainy")){
         System.out.println("stay home");
     }
     else if(weather.equals("windy") || weather.equals("windy")){
         System.out.println("fly a kite");
     }
     else {
         System.out.println("not a valid weather type");
     }


    }
}
