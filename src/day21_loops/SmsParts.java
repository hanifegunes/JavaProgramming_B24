package day21_loops;

public class SmsParts {
    public static void main(String[] args) {
        /*[SMS parts]
Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
Separate these parts and print them separately: Sender: actualSender
Number: actualNumber Message: actualMessage”



         */
        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";
      int indexOfSenderBegin = msg.indexOf("<");//indexOfSenderBegin = msg.indexOf(">")+1;
       int indexOfSenderClosing = msg.indexOf(">");
        System.out.println(indexOfSenderBegin);
        System.out.println(indexOfSenderClosing);

        int indexOfNumberBegin = msg.indexOf("[");
        int indexOfNumberClose = msg.indexOf("]");

        int indexOfMsgBegin = msg.indexOf("{");
        int indexOfMsgClose = msg.indexOf("}");
        String sender = msg.substring(indexOfSenderBegin+1,indexOfSenderClosing);
        String number = msg.substring(indexOfNumberBegin+1,indexOfNumberClose);
        String message =msg.substring(indexOfMsgBegin+1,indexOfMsgClose);

        System.out.println("Sender:"+sender);
        System.out.println("number: "+number);
        System.out.println("message :"+message);



    }
}
