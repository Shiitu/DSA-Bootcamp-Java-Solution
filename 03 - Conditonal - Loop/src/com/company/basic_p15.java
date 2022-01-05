package com.company;

import java.util.Scanner;

public class basic_p15 {
    public static void main(String[] args) {
//        Volume OF Cylinder
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Cylinder : ");
        float r = sc.nextFloat();
        System.out.println("Enter the height of Cylinder : ");
        float h = sc.nextFloat();
        double volume = 3.14*r*r*h;
        System.out.println("Volume Of Cylinder having base radius and height "+r+" & "+h+ " is "+volume);
    }
}
