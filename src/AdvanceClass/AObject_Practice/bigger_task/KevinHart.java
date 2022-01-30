package AdvanceClass.AObject_Practice.bigger_task;

public class KevinHart extends LiveShow{
    String special;
    String date;

    public  KevinHart( String location,String special,String date){
        super("Kevin Hart inc.",location);
        this.special = special;
        this.date = date;


    }

    @Override
    public String toString() {
        return "KevinHart{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", special='" + special + '\'' +
                ", date='" + date + '\'' +
                ", location='" + location + '\'' +
                '}';
    }





}
