package com.company;

import java.util.Scanner;

public class func_p13 {
//    Write a function that returns the sum of first n natural numbers.
    static int num (int a){
        int sum =0;
        for(int i =0; i<=a;i++){
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n : ");
        int a = sc.nextInt();
        System.out.println("Sum of "+a+" number is : "+num(a));


    }
}
