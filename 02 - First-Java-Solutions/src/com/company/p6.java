package com.company;
import java.util.Scanner;
public class p6 {
    public static void main(String[] args) {
//        Input currency in rupees and output in USD.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in rupee : ");
        float rupee = sc.nextInt();
        double p = (rupee) / (74.51);
        System.out.println("You amount in dollor is : " + p);
    }
}
