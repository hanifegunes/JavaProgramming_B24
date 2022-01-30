package extraRepeatExamples;

public class Calculation {
    public static void main(String[] args) {
       int i = 10;
       int j = 20;
        System.out.println(j);
       int k = (j +=i)/ 5;
        System.out.println(j);
        System.out.println(i + " : "+ j+" "+k);
    }
}
