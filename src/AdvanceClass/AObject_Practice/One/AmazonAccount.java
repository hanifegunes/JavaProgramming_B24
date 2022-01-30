package AdvanceClass.AObject_Practice.One;

import AdvanceClass.AObject_Practice.device.Device;

public class AmazonAccount {



    private   String userName;
    private String email;
    private   boolean hasPrime;

    public AmazonAccount(String userName, String email,boolean hasPrime){
        this.userName = userName;
        this.email = email;
        this.hasPrime = hasPrime;

    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHasPrime(boolean hasPrime) {
        this.hasPrime = hasPrime;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isHasPrime() {
        return hasPrime;
    }

    @Override
    public String toString() {
        return "AmazonAccount{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", hasPrime=" + hasPrime +
                '}';
    }

    public static void main(String[] args) {
        AmazonAccount account = new AmazonAccount("danya","abc@gmail",true);
        System.out.println(account);

    }




}
