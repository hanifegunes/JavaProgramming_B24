package homework_1week;

public class Computer {
    public static void main(String[] args) {

     String brand = "Dell",
             processor = "Intel core i5 processor ",
             color = "black",
             description ="15-inch Dell Inspiron  ";
     short rMemory = 12,// gb
        sMemory = 512,
             cpu = 5,
             nOfMonitors = 1,
             nOfUsbSlots = 1;
     int storageMemory = 256;
     double price = 600;
     boolean hasUsb= true,
        hasWifiCard = true,
             hasMonitor = true;

        System.out.println("\t\tComputer Details" + "\nBrand: \t\t " +brand +"\nProcessor:\t\t"+ processor +
                "|NDescription: "+description+"\nColor:\t\t\t\t" +color +"\nRam Memory:\t\t\t"+ rMemory +"GB" + "\nStorage Memory:\t\t"+ sMemory +"GB"+"\nCPU\t\t\t\t\t\t"+cpu+ "\nHas a monitor:\t\t" + hasMonitor+ nOfMonitors+ "\nHas a USB:\t\t\t"+ hasUsb +"\nHas a wifi card:\t" + hasWifiCard +"\nThis computer is:\t"+price+"$");










    }
}
