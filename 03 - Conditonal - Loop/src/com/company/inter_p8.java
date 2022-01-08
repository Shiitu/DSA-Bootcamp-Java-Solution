package com.company;

import java.util.Scanner;

public class inter_p8 {
    public static void main(String[] args) {
//        Calculate Depreciation of Value
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Depreciation factor : ");
        float a = sc.nextFloat();
        System.out.println("enter the time span : ");
        float b = sc.nextFloat();
        System.out.println("enter the Remaining booking amount : ");
        float c = sc.nextFloat();
        double d = (a*c)/b;
        System.out.println("Depreciation of Value is "+d);

    }
}
