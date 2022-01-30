package day46_constructors;

public class Address {
    String city ;
    String street;
    String zipcode;
    String country = "US";
    String state;
    public  Address(String street, String city, String state,String zipcode){
     // instance.variable ==below
       this.street = street;
       this.city = city;
       this.state = state;
       this.zipcode = zipcode;
        country = "US";
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Address address = new Address("100032 Oak Drive", "Chicago", "IL","490101");
        System.out.println(address);


    }


}
