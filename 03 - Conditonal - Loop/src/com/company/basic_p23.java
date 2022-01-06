package com.company;

import java.util.Scanner;

public class basic_p23 {
    public static void main(String[] args) {
//        Input a number and print all the factors of that number (use loops).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = sc.nextInt();
        for (int i = 1; i<a;i++){
            if (a%i==0){
                System.out.print("\t"+i);
            }
        }
    }
}
