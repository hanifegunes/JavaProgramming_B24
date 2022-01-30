package OfficeHomework;

import java.util.Scanner;

public class PandemicYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the year");
        int year = input.nextInt();
        if (year<0 || year> 2021){
            System.out.println("not valid");

        if(year >= 1346 && year <= 1353){
            System.out.println("1346-1353: The Black Death");
        }else if(year >= 1665 && year <= 1666){
            System.out.println("1665-1666: Great Plague of London");
        }else if(year >= 1770 && year <= 1772) {
            System.out.println("1770-1772: Russian plague");
        }else if(year >= 1889 && year <= 1890) {
            System.out.println("1889-1890: Flu pandemic");}
        else if(year == 1916 ) {
            System.out.println("1916: American polio epidemic");}
        else if(year >= 1818 && year <= 1920) {
            System.out.println("1918-1920: Spanish Flu");}
        else if(year >= 2009 && year <= 2010) {
            System.out.println("2009-2010: H1N1 Swine Flu pandemic");}
        else if(year >= 2014 && year <= 2016) {
            System.out.println("2014-2016: West African Ebola epidemic");}
        else if(year >= 2020 && year <= 2021) {
            System.out.println("2020-2021: COVID-19");}}




        else {
            System.out.println("No Pandemic");}





    }
}
