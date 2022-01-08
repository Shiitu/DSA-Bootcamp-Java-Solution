package com.company;
import java.util.Scanner;
public class inter_p2 {
    public static void main(String[] args) {
//        Calculate Electricity Bill
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of kilowatts used : ");
        float w = sc.nextFloat();
        System.out.println("Enter the number of hours used in a days : ");
        float d = sc.nextFloat();
        System.out.println("Enter the number of days used in a month : ");
        float m = sc.nextFloat();
        double total = w*d*m;
        System.out.println("The total electricity : "+total+ "kWh");
        double rate = 1.2*total;
        System.out.println("The amount of electricity is : "+rate);
    }
}
