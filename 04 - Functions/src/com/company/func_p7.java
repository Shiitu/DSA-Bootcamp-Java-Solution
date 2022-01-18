package com.company;
import java.util.Scanner;
public class func_p7 {
//    Define a method to find out if a number is prime or not.
    public static boolean check(int a){
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number : ");
        int a = sc.nextInt();
        if(check(a)){
            System.out.println("It is a prime number.");
        }
        else{
            System.out.println("It is not a prime.");
        }
    }
}
