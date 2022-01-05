package com.company;

import java.util.Scanner;

public class basic_p6 {
    public static void main(String[] args) {
//        Area Of Rhombus
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Diagonals of Rhombus : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        double area = 0.5*a*b;
        System.out.println("area of rhombus having Diagonal length "+a+" & "+b+" is "+area);


    }
}
