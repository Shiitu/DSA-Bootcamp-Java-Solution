package com.company;
import java.util.Scanner;
public class basic_p11 {
    public static void main(String[] args) {
//        Perimeter Of Rectangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side of Rectangle : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float per = 2*(a*b);
        System.out.println("Perimeter Of Rectangle having sides "+a+" & "+b+ " is "+per+" unit");

    }
}
