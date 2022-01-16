package com.company;
import java.util.Scanner;
public class inter_p24 {
    public static void main(String[] args) {
//        Sum Of A Digits Of Number
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int a = sc.nextInt();
        int sum = 0;
        while (a!=0){
            sum = sum+a%10;
            a = a/10;
        }
        System.out.println("Sum of A digits of given Number is "+sum);
    }
}
