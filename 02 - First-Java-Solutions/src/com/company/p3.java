package com.company;
import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
//        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome Simple interest Calculator !!");
        System.out.println("Enter you Principle Amount : ");
        float p = sc.nextInt();
        System.out.println("Enter you Time Period in year : ");
        float t = sc.nextFloat();
        System.out.println("Enter you rate : ");
        float r = sc.nextFloat();
        float SI = (p*t*r)/100;
        System.out.println("your Simple Interest is : "+SI);
    }
}
