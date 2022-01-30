package AdvanceClass.AObject_Practice.One;

import AdvanceClass.AObject_Practice.device.Device;

public class AmazonUse {
    public static void main(String[] args) {
        AmazonAccount account1 = new AmazonAccount("asdf","asd@gmail",false);
        System.out.println(account1.getUserName());
        System.out.println(account1.getEmail());
        account1.setEmail("awe@gmail.com");
        account1.setHasPrime(false);
        System.out.println(account1.toString());
    }
}
