package AdvanceClass.AObject_Practice.bigger_task;

import java.util.ArrayList;

public class Youtube extends Streaming{
    String videoName;
    String channel;
    int view;
    ArrayList<Streaming> comments  = new ArrayList<>();


    public Youtube( String company,double duration,String videoName,String channel,int view,ArrayList<Streaming> comments){
        super(company,duration);
        this.channel = channel;
        this.view = view;
        this.videoName = videoName;
        this.comments =comments;
}
}