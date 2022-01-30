package homework_7custom_class;

public class Pizza {
    /*
    custom classes
    create a custom class for Pizza
    that should contain the following:
    variables:
    size (either small, medium, large)
    number of cheese topping
    number of veggie topping
     tip:
     constructor methods:
     customizeOrder():
      allows user to set the size and toppings of Pizza
      calcCost():
     returns the total cost  as double



     */
     String  size;
    int cheeseNums;
    int veggiNums;
    int pepperoni;
    double totalPrice;
    public Pizza (String size, int cheeseNums, int veggiNums,int pepperoni){
        this.size = size;
        this.cheeseNums = cheeseNums;
        this.veggiNums= veggiNums;
        this.pepperoni = pepperoni;
        calculatePrice();
    }
    public void calculatePrice(){
        if(size.equals("Small"))
        { totalPrice =10+( cheeseNums*veggiNums)+( pepperoni);
        }else  if(size.equals("Medium") ){
            totalPrice =12+( cheeseNums*veggiNums)+(1.5* pepperoni);
        }else  if(size.equals("Large") ){
            totalPrice =14+( cheeseNums*veggiNums)+(1.5* pepperoni);
        }




    }  public  String toString() {
     return  "Size: "+ size+ " Cheese toppings: "+cheeseNums + " veggi toppings :"+veggiNums +" Pepporoni: "+ pepperoni+ " total price: $" +totalPrice;

    }

    public static void main(String[] args) {
         Pizza pizza = new Pizza("Small",2,5,1);
        System.out.println(pizza);
    }

}
