package homework_1week;

public class Apartment {
    public static void main(String[] args) {

    String aName = "Colorado",
    nOfOwner =    "Mr. Smith",
            pNumber = "***_***_***";
    int nOfUnits = 1200,
            tNumberOfResidents = 8002,
            tNumberOfParking = 2500;
    double mPayment = 1000,
            nOfReviewStars = 4.2;
    short nOfWasherDry = 20,
            lengthOfLease = 12,//months
        nOfFloors = 4;

    boolean aPets = true,
            hasPool =true,
            hasBasement = false,
            hasAveUnitForRent = true,
            hasAirComd = true,
            hasWheelAccess = true;

        double newRentAfter3Years = mPayment * 0.9,    //Monthly Rent after 3 years
                newRentAfter6Years = mPayment * 0.8,   //Monthly Rent after 6 years
                averageNumberOfResidentsPerUnit = tNumberOfResidents / nOfUnits,
                averageNumberOfParkingSpotsPerUnit = tNumberOfParking / nOfUnits,
                averageNumberOfUnitsPerFloor = nOfUnits / nOfFloors;

        System.out.println("******"+ aName+"******"+"\nOwner:\t\t\t" +nOfOwner+"\nPhone number:\t"+pNumber+"\nNumber of units:\t\t\t\t\t"+nOfUnits+ "\nTotal number of residents:\t\t\t"+ tNumberOfResidents+ "\nTotal number of parking:\t\t\t"+tNumberOfParking+ "\nMonthly payment:\t\t\t\t\t" +
                +mPayment+"$"+"\nStar rating:\t\t\t\t\t\t"+nOfReviewStars+ "\nNumber of Washer& Dryer:\t\t\t" + nOfWasherDry+"\nLength of lease:\t\t\t\t\t"+ lengthOfLease+"\nNumber of floors:\t\t\t\t\t"+ nOfFloors+"\nAllows pets:\t\t\t\t\t\t"+aPets+ "\nHas pool:\t\t\t\t\t\t\t"+hasPool+"\nHas basement:\t\t\t\t\t\t"+hasBasement+"\nHas available unit for rent:\t\t"+ hasAveUnitForRent+"\nHas air conditioner:\t\t\t\t"+hasAirComd+"\nHas wheel chair access:\t\t\t\t"+hasWheelAccess+"\nAvarage number of residents per unit:\t\t"+averageNumberOfResidentsPerUnit+"\nAverage number of parking spots per unit:\t"+averageNumberOfParkingSpotsPerUnit+"\nAverage number of units for floor:\t"+averageNumberOfUnitsPerFloor+"\n\nNew rent after 3 years:\t\t\t\t"+newRentAfter3Years+"\n\nNew rent after 6 years:\t\t\t\t"+ newRentAfter6Years);






    }
}
