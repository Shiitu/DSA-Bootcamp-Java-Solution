package com.company;
import java.util.Scanner;
public class basic_p3 {
    public static void main(String[] args) {
//        Area Of Rectangle Program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and Breadth of rectangle : ");
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        double area = l*b;
        System.out.println("Area of rectangle having length "+l+" & breadth is "+b+" is "+area);
    }
}
