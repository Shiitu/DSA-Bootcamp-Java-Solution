package com.company;
import java.util.Scanner;
public class inter_p7 {
    public static void main(String[] args) {
//        Power In Java
        Scanner sc = new Scanner(System.in);
        System.out.println("The base : ");
        int a = sc.nextInt();
        System.out.println("Enter the power : ");
        int b = sc.nextInt();
        double c = Math.pow(a,b);
        System.out.println("The answer of having base "+a+" and power "+b+" is "+c);
    }
}
