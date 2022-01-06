package com.company;
import java.util.Scanner;
public class basic_p19 {
    public static void main(String[] args) {
//        Curved Surface Area Of Cylinder
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Cylinder : ");
        float r = sc.nextFloat();
        System.out.println("Enter the height of Cylinder : ");
        float h = sc.nextFloat();
        double csa = 2*3.14*r*h;
        System.out.println("Curved Surface Area Of Cylinder having radius "+r+" & height"+h+" is "+csa);
    }
}
