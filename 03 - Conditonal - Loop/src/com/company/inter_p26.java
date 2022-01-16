package com.company;
import java.util.Scanner;
public class inter_p26 {
    public static void main(String[] args) {
        //        Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive
//        odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
        Scanner sc = new Scanner(System.in);
        int sump=0, sumn=0,sumodd=0,sumeven=0;
        System.out.println("Enter the number : ");
        while (true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            if (n<0){
                sumn +=n;
            }
            else if (n%2==0){
                sumeven +=n;
            }
            else{
                sumodd +=n;
            }
        }
        System.out.println("Sum of Negative : "+sumn);
        System.out.println("Sum of Even Number : "+sumeven);
        System.out.println("Sum of odd Number : "+sumodd);
    }
}
