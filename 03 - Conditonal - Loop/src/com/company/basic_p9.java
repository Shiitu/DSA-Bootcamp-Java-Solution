package com.company;
import java.util.Scanner;
public class basic_p9 {
    public static void main(String[] args) {
//        Perimeter Of Equilateral Triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the Side of Equilateral Triangle : ");
        float a = sc.nextFloat();
        float per = 3*a;
        System.out.println("Perimeter Of Equilateral Triangle having side "+a+" is "+per);
    }
}
