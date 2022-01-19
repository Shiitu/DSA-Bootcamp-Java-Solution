package com.company;

import java.util.Scanner;

public class func_p10 {
//    Write a function to find if a number is a palindrome or not. Take number as parameter.
    static String check(int a){
        int temp = a;
        int sum =0;
        while(a>0){
            int r = a%10;
            sum = (sum*10)+r;
            a = a/10;
        }
        String ch = "";
        if (temp == sum){
            ch = "It is Palindrome";
        }
        else{
            ch = "It is not a Palindrome";
        }
        return ch;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int a = sc.nextInt();
    System.out.println(check(a));
}
}
