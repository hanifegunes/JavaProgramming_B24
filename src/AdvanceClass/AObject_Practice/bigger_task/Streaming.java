package AdvanceClass.AObject_Practice.bigger_task;

public class Streaming extends Entertainment{

    double duration;

    public Streaming( String company,double duration){
        super("Streaming",company);
        this.duration = duration;
    }// name is hardcoded here

    @Override
    public String toString() {
        return "Streaming{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", duration=" + duration +
                '}';
    }
}
