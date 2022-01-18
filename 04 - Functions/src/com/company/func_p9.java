package com.company;

import java.util.Scanner;

public class func_p9 {
//    Write a program to print the factorial of a number by defining a method named 'Factorial'.
    static int fact(int a ){
        int factorial = 1;
        for (int i =1; i<=a; i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("The factorial of given number is : "+fact(a));


    }
}
