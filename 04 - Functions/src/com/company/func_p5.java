package com.company;
import java.util.Scanner;
public class func_p5 {
//    Define a method that returns the product of two numbers entered by user.
    public static int product(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.println("Product of these two number are : "+product(a,b));


    }
}
