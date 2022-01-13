package com.company;

import java.util.Scanner;

public class inter_p19 {
    public static void main(String[] args) {
//        HCF Of Two Numbers Program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number :  ");
        int b = sc.nextInt();
        int hcf =0;
        for (int i =1; i<=a ||i<=b;i++){
            if(a%i == 0 && b%i==0)
                hcf = i;
        }
        System.out.println("HCF Of Two Numbers "+a+" & "+b+" is "+hcf);
    }
}
