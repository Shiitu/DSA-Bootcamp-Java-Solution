package com.company;
import java.util.Scanner;
public class func_p12 {
//    Write a function to check if a given triplet is a Pythagorean triplet or not.
    static String check(int a , int b, int c){
        String ch = "";
        if ((a*a)+(b*b)==c*c){
            ch = "Pythagorean triplet";
        }
        else {
            ch = "Not Pythagorean triplet";
        }
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int b = sc.nextInt();
        System.out.println("Enter the height : ");
        int h = sc.nextInt();
        System.out.println("Enter the Hypotenuse : ");
        int p = sc.nextInt();
        System.out.println("It is "+check(b,h,p));
    }
}
