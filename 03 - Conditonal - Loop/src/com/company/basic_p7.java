package com.company;
import java.util.Scanner;
public class basic_p7 {
    public static void main(String[] args) {
//        Area Of Equilateral Triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Equilateral Triangle : ");
        float a = sc.nextFloat();
        double area = (Math.sqrt(3)/4)*a*a;
        System.out.println("Area Of Equilateral Triangle having side length "+a+ " is "+area+" sq. unit");
    }
}
