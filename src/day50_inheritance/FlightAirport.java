package day50_inheritance;

public class FlightAirport {
    public static void main(String[] args) {
        FlightTicket ticket = new FlightTicket("first","new york","florida");
        /*
        we cannot access directly
        ticket.type;
        ticket.departureLocation;
        ticket.arrivalTime;
         */
        System.out.println(ticket.getType());
        // get is return type we need to sout it
        System.out.println(ticket.getArrivalLocation());
        System.out.println(ticket.getDepartureLocation());
       ticket.setType("economy");// set is void method, can not sout directly
        System.out.println(ticket.getType());



    }
}
