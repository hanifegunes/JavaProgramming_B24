package day55_abstraction.exercise;

public class Squatting extends Lifting{
    @Override
    public void  perform(){
        System.out.println("Squatting...");
    }
    @Override
    public  void  getCaloriesBurned(int minutes){
        System.out.println(minutes*0.3);
    }

    @Override
    public void rackWeights() {
        System.out.println("putting away the weights");
    }
}
