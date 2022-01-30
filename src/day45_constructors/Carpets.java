package day45_constructors;

public class Carpets {
    double width;
    double length;
    double unitPrice;
    double totalPrice;
    boolean isPersian;

    public Carpets(double inputWidth, double inputLength, double inputUnitPrice, boolean inputIsPersian){

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
        return "Carpets{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                ", isPersian=" + isPersian +
                '}';
    }

    public static void main(String[] args) {

    }



}
