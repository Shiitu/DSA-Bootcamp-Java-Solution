package com.company;
import java.util.Scanner;
public class basic_p20 {
    public static void main(String[] args) {
//        Total Surface Area Of Cube
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side : ");
        float a = sc.nextFloat();
        float tsa = 6*a*a;
        System.out.println("Total Surface Area Of Cube having edge "+a+" is "+tsa);
    }
}
