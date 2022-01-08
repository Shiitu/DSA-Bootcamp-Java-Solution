package com.company;

import java.util.Scanner;

public class inter_p12 {
    public static void main(String[] args) {
//        Compound Interest Java Program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount : ");
        float p = sc.nextFloat();
        System.out.println("Enter the rate in % : ");
        float r = sc.nextFloat();
        System.out.println("Enter the time span in year : ");
        float t = sc.nextFloat();
        double ci =(1+r/100);
        double cf = p*Math.pow(ci,t);
        System.out.println("Compound Interest is "+cf);
    }
}
