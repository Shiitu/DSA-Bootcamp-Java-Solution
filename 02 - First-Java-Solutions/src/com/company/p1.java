package com.company;
import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        //1. Write a program to print whether a number is even or odd, also take input.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number you want to check : ");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("Your number "+n+" is a even number.");
        }
        else{
            System.out.println("Your number "+n+" is an odd number.");
        }
    }
}
