package extraRepeatExamples;

public class CountHer {
    public static void main(String[] args) {
        String str = "hertyuherhertyuher";
        int count =0;
        for(int i = 0; i< str.length()-1; i++){
            if(str.charAt(i)=='h' && str.charAt(i+1)== 'e'&& str.charAt(i+2)== 'r'){
                count++;
            }
            //System.out.println("her "+count);
        } System.out.println("her "+count);


    }
}
