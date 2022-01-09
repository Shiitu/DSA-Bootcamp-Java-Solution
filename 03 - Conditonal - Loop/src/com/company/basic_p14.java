package com.company;
import java.util.Scanner;
public class basic_p14 {
    public static void main(String[] args) {
//        Volume of cone
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cone : ");
        float r = sc.nextFloat();
        System.out.println("Enter the height of cone : ");
        float h = sc.nextFloat();
        double volume = 3.14*r*r*(h/3);
        System.out.println("Volume Of Cone having base radius and height "+r+" & "+h+ " is "+volume+ " cub. unit");
    }
}
