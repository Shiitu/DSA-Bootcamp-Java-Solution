package com.company;
import java.util.Scanner;
public class basic_p17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere : ");
        float r= sc.nextFloat();
        double vol = (4/3)*3.14*r*r*r;
        System.out.println("Volume Of Sphere having radius "+r+" is "+vol+ " cub. unit");
    }
}
