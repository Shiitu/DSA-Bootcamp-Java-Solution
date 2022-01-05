package com.company;
import java.util.Scanner;
public class p5 {
    public static void main(String[] args) {
//        Take 2 numbers as input and print the largest number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st and 2nd number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<b){
            System.out.println("The largest number is "+b);
        }
        else if (b>a){
            System.out.println("the largest number is "+a);
        }
        else {
            System.out.println("Both numbers are equal");
        }
    }
}
