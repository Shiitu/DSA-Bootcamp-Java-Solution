package com.company;
import java.util.Scanner;
public class basic_p4 {
    public static void main(String[] args) {
//        Area Of Isosceles Triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of equal sides : ");
        float a = sc.nextFloat();
        System.out.println("Enter the base of that triangle  : ");
        float b = sc.nextFloat();
        double h = Math.sqrt((a*a)-((b*b)/4));
        double area = (h*b)/2;
        System.out.println("Area of isosceles triangle have equal sides are "+a+" & base "+b+" is "+area);
    }
}
