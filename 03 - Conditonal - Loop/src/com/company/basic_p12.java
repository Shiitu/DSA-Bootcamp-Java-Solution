package com.company;
import java.util.Scanner;
public class basic_p12 {
    public static void main(String[] args) {
//        Perimeter Of Square
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Square : ");
        float a = sc.nextFloat();
        float per = 4*a;
        System.out.println("Perimeter Of Square having side "+a+" is "+per);
    }
}
