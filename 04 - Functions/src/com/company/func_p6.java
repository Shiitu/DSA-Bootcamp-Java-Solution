package com.company;
import java.util.Scanner;
public class func_p6 {
//    Write a program to print the circumference and area of a circle of radius entered by user
//    by defining your own method.
    public static double area(float a){
        double area = 3.14*a*a;
        return area ;
    }
    public static double cir( float a){
        double circ = 2*3.14*a;
        return circ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Circle : ");
        float r = sc.nextInt();
        System.out.println("Circumference of Circle of given radius is : "+cir(r));
        System.out.println("Area of circle of given radius is : "+area(r));
    }
}
