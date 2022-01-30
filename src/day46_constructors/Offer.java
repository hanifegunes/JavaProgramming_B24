package day46_constructors;

public class Offer {
  String location;
  String company;
  double salary;
  boolean isFullTime;
  int numberOfPTO;

  public  Offer (String location,String company,double salary,boolean isFullTime, int numberOfPTO){
      this.location = location;
      this.company = company;
      this.salary= salary;
      this.isFullTime = isFullTime;
      this.numberOfPTO = numberOfPTO;

  }
    public  Offer (String company,double salary,boolean isFullTime){

        this.company = company;
        this.salary= salary;
        this.isFullTime = isFullTime;


    }







   /*
   String s = "java;
   s.charAt(0) -> j
   s.substring(1,2) -> a
   new Offer().variable
   new Offer() .method

    */

    @Override
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPTO=" + numberOfPTO +
                '}';
    }
}
