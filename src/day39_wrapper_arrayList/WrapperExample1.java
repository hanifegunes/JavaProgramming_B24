package day39_wrapper_arrayList;

public class WrapperExample1 {
    public static void main(String[] args) {
        int a = 5;
      //you can not use method from it . ex. a. method()
      // you can print, assign, reassign, calculations, casting
      Integer i1 = new Integer(10); //() can not be empty,should be a number in(10)
        Integer i2 = 100;


        System.out.println(i1);
        System.out.println(i2);
        System.out.println("-----------");
        byte b1 = 4;
        Byte b2 = new Byte((byte)5); // storing int number as a byte
        Byte b3 = (byte)500;
        Byte b4 = 100;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3); // -12, you lost data
        System.out.println(b4);
        System.out.println("----------------");
        short s = 100;
        Short s2 = new Short((short) 200);// storing int into short type
        Short s3 = 300; // easy way -- this is the Short wrapper class
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("===============");
        long l = 1000L;
        Long l2 = new Long(2000L);

        Long l3 = 3000L;
        System.out.println(l);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println("------------");
        Float f1 = new Float(4.5F);
        Float f2 = 4.6f;
        System.out.println(f1);
        System.out.println(f2);






    }
}
