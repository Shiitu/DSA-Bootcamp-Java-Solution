package com.company;
import java.util.Scanner;
public class basic_p1 {
    public static void main(String[] args) {
//        Area Of Circle Java Program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        float r = sc.nextFloat();
        double area = 3.14*r*r;
        System.out.println("Area of Circle has radius "+r+" is "+area);
    }
}
