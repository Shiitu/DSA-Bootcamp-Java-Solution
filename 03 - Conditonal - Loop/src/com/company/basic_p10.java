package com.company;
import java.util.Scanner;
public class basic_p10 {
    public static void main(String[] args) {
//        Perimeter Of Parallelogram
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of Parallelogram : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float per = 2*(a+b);
        System.out.println("Perimeter Of Parallelogram having sides "+a+" & "+b+ " is "+per);
    }
}
