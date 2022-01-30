package day45_constructors;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    double totalPrice;
    boolean isPersian;

    public  Carpet(double inputWidth, double inputLength, double inputUnitPrice, boolean inputIsPersian){
     width= inputWidth;
     length = inputLength;
     unitPrice =inputUnitPrice;
      isPersian = inputIsPersian;
      totalPrice =(width*length*unitPrice);
        if(isPersian){
            totalPrice += 200;
        }


    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                ", isPersian=" + isPersian +
                '}';
    }

    public static void main(String[] args) {
        Carpet carpet = new Carpet(6.1,9.2,10.3,true);

        System.out.println(carpet);

    }





}
