package com.company;
import java.util.Scanner;
public class func_p3 {
//    A person is eligible to vote if his/her age is greater than or equal to 18. Define a method
//    to find out if he/she is eligible to vote.
    public static String eligible(int a){
        String check = "eligible";
        if (a>=18){
            check = "You are Eligible for Vote." ;
        }
        else{
            check = "You are not Eligible for Vote.";
        }
        return check;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age : ");
    int a = sc.nextInt();
    System.out.println(" "+eligible(a));
}
}
