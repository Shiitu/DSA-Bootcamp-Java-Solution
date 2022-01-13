package com.company;

import java.util.Scanner;

public class inter_p18 {
    public static void main(String[] args) {
//        Future Investment Value
//        future value = present value x [1 + (interest rate x time)]
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Present value : ");
        float p = sc.nextFloat();
        System.out.println("Enter the interest rate : ");
        float r = sc.nextFloat();
        System.out.println("Enter the time period : ");
        float t = sc.nextFloat();
        double f = p*(1+(r*t));
        System.out.println("Your Future Investment having Present value ="+p+"\n Interest rate "+r+"\n & Time "+t+" is "+f);
    }
}
