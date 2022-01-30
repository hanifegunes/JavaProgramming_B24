package office_hours.practice_10_27;

public class Quiz {
    /*
    create a class Quiz

  instance variables:
            - topic (String)
   - total number of questions (int)
   - total points (double)

     */
         String topic;
         int numOfQuestions;
         double totalPrice;
         public Quiz(String topic,int numOfQuestions,double totalPrice){
             this.topic =topic;
             this.totalPrice = totalPrice;
             this.totalPrice = totalPrice;
         }
         public  void takeQuiz(){
             System.out.println("Taking "+ topic+ " quiz");
         }

    @Override
    public String toString() {
        return "Quiz{" +
                "topic='" + topic + '\'' +
                ", numOfQuestions=" + numOfQuestions +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
