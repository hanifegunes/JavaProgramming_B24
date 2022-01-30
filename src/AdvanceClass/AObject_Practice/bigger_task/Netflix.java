package AdvanceClass.AObject_Practice.bigger_task;

public class Netflix extends Streaming{
    String showName;
    int episode;
    int season;
    public Netflix(String showName,int episode,int season,String name,double duration){
        super("Netflix",duration);//calls line 7 from streaming class
        //name is hard coded here
        this.episode = episode;
        this.season =season;
        this.showName = showName;


    }

}
