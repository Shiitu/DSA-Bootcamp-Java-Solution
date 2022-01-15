package com.company;
import java.util.Scanner;
public class inter_p24 {
    public static void main(String[] args) {
//        Sum Of A Digits Of Number
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        while(a!=0){
            sum = sum+a%10;
            a = a/10;
        }
        System.out.println("Sum Of digits of given number is "+sum);
    }
}
