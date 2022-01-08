package com.company;
import java.util.Scanner;
public class inter_p4 {
    public static void main(String[] args) {
//        Calculate Discount Of Product
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the orginial price : ");
        float p = sc.nextFloat();
        System.out.println("enter the percenatage discount : (in %)");
        float dp = sc.nextFloat();
        float dr = (dp/100)*p;
        System.out.println("Discount price : "+dr);
        float ad = p - dr;
        System.out.println("Price after discount  : "+ad);
    }
}
