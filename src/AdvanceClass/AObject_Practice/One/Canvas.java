package AdvanceClass.AObject_Practice.One;

import java.util.ArrayList;

public class Canvas {
    /*
        create a class Canvas

      instance variables:
       - topic (String)
       - quizzes (ArrayList of Quiz objects)
       - modules (ArrayList of Module objects)

      constructor:
       - initialize topic
        -> create empty ArrayList objects for quizzes and modules
       - overload to accept the ArrayList of Quizzes and ArrayList of Module
        + chain the constructors
     Create a class UsingCanvas

      create an object of the Canvas and verify all the fields and methods can be
    accessed and used

         */
    String topic;
    ArrayList<Quiz> quizzes;
    ArrayList<Module>modules;
  //  ArrayList<java.lang.Module>modules;
    public  Canvas(String topic){
        this.topic= topic;
        quizzes= new ArrayList<>();
        modules = new ArrayList<>();
    }
    public  Canvas(){

    };

    public  Canvas(String topic, ArrayList<Quiz>quizzes,ArrayList<Module>modules, int _ignore){
        this(topic);
        this.quizzes =quizzes;
        this.modules=modules;
    }




    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules) {
        this(topic);
        this.quizzes = quizzes;
        this.modules = modules;
    }

    @Override
    public String toString() {
        return "Canvas{" +
                "topic='" + topic + '\'' +
                ", quizzes=" + quizzes +
                ", modules=" + modules +
                '}';
    }
}
