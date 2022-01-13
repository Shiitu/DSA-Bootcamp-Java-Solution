package com.company;

import java.util.Scanner;

public class inter_p20 {
    public static void main(String[] args) {
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
        int lcm = a*b/hcf;
        System.out.println("LCM Of Two Numbers "+a+" & "+b+" is "+lcm);
    }
}
