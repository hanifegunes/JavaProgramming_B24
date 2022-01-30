package AdvanceClass.AObject_Practice.One;

public class Quiz {
    String topic;
    int totalNumQuest;
    double points;



    public  Quiz(String topic, int totalNumQuest, double points) {
        this.topic = topic;
        this.totalNumQuest = totalNumQuest;
        this.points = points;

    }

    public  void takeQuiz(){
        System.out.println("Taking the "+ topic + " quiz" );
    }
        @Override
        public String toString() {
            return "Quiz{" +
                    "topic='" + topic + '\'' +
                    ", totalNumQuest=" + totalNumQuest +
                    ", points=" + points +
                    '}';
        }





}
