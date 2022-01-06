package com.company;
import java.util.Scanner;
public class basic_p24 {
    public static void main(String[] args) {
//        Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int x = sc.nextInt();
        System.out.println("Enter the number ");
        while (x!=0 ){
            x = sc.nextInt();
            sum = sum+x;
        }
        System.out.println("Sum of the entered  numbers : "+sum);
    }
}
