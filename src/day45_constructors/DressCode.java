package day45_constructors;

public class DressCode {
    String color;
    int size;
    int height;
    String material;
    double totalPrice;
    boolean isNew;

    public  DressCode (String inputColor, int inputSize,int inputHeight, String inputMaterial, boolean inputIsNew){
     color =inputColor;
     size = inputSize;
     height = inputHeight;
     material = inputMaterial;
     isNew =inputIsNew;
      totalPrice = (height*size);
      if(isNew){
          totalPrice += 30;
      }

    }

    @Override
    public String toString() {
        return "DressCode{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", height=" + height +
                ", material='" + material + '\'' +
                ", totalPrice=" + totalPrice +
                ", isCotton=" + isNew +
                '}';
    }

    public static void main(String[] args) {

    }


}
