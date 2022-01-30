package day47_constructors;

public class SalaryCalculator {
    /*
    Create class called SalaryCalculator-
     instance variables:
      hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate-
      static variables: country (usa). Use static block-
      add a constructor can initialize those fields-
      instance methods:salary():
       returns the total salary as double  (hourlyRate * weeklyHours * 48)

     */
    double hourlyRate;
    double weeklyHours;
    double stateTaxRate;
    double federalTaxRate;
    double totalPrice;


    static String country;
     static {
         country = "US";
     }
     public SalaryCalculator(double hourlyRate, double weeklyHours, double stateTaxRate,double federalTaxRate){
         this.hourlyRate = hourlyRate;
         this.weeklyHours= weeklyHours;
         this.stateTaxRate = stateTaxRate;
         this.federalTaxRate = federalTaxRate;
         calculatePrice();
     }
     public  void calculatePrice(){
         totalPrice =(hourlyRate*weeklyHours*48)-(stateTaxRate +federalTaxRate);

     }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
