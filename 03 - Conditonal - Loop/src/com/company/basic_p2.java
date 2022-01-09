package com.company;
import java.util.Scanner;
public class basic_p2 {
    public static void main(String[] args) {
//        Area Of Triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of triangle : ");
        float b = sc.nextFloat();
        System.out.println("Enter the height of triangle : ");
        float h = sc.nextFloat();
        double area = 0.5*b*h;
        System.out.println("Area of triangle having base is "+b+" & height is "+h+ " is "+area+" sq. unit");

    }
}
