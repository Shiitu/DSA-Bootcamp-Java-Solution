package com.company;
import java.util.Scanner;
public class basic_p22 {
    public static void main(String[] args) {
//        Subtract the Product and Sum of Digits of an Integer
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your 2 Digits : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = a*b;
        int add = a+b;
        int sub = p-add;
        System.out.println("Subtract the Product and Sum of Digits of an Integer is "+sub);
    }
}
