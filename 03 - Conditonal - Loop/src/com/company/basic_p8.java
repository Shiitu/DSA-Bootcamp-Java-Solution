package com.company;
import java.util.Scanner;
public class basic_p8 {
    public static void main(String[] args) {
//        Perimeter Of Circle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        float r = sc.nextFloat();
        double peri = 2*3.14*r;
        System.out.println("Perimeter Of Circle having radius "+r+" is "+peri);
    }
}
