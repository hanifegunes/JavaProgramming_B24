package day50_inheritance;

public class FlightTicket {
    /*
      instance variables:
                type (first, business, economy)
                departure location
                arrival location

            constructor: initialize all fields
                -> only allow the given ticket types to be set

            encapsulate all the fields

     */
    private String type;
    private String departureLocation;
    private String arrivalLocation;

    public FlightTicket(String type,String departureLocation,String arrivalLocation){
     setType(type);                   // this.type =type;we set type here for different choices, they will be selected, if we don't use just that 3 choices so it will print the other one instead of invalid, 'private jet'
        // for encapsulation we need set and get
      this.departureLocation= departureLocation;
      this.arrivalLocation= arrivalLocation;
    }



    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type.equals("first")|| type.equals("business")|| type.equals("economy"))
        this.type = type;
    }
}
