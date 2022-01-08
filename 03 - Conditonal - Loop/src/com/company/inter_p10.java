package com.company;

import java.util.Scanner;

public class inter_p10 {
    public static void main(String[] args) {
//        Calculate Average Marks
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects : ");
        int n = sc.nextInt();
        int[] c = new int[n];
        System.out.println("Enter your number per subjects in "+n+ " subjects");
        for (int i =0; i<n;i++){
            c[i]= sc.nextInt();
        }
        System.out.println("Your Numbers are  :");
        for (int i =0; i<n; i++){
            System.out.println(" "+c[i]);
        }
        int sum=0;
        for (int i =0; i<n; i++){
            sum = sum +c[i];
        }
        int avg = sum/n;
        System.out.println(" Average Marks is "+avg);
    }
}
