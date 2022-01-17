package com.company;
import java.util.Scanner;
public class func_p4 {
//    Write a program to print the sum of two numbers entered by user by defining your own method.
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.println("Sum of these two number are : "+sum(a,b));

    }
}
