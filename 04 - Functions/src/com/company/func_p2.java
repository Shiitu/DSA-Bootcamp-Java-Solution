package com.company;
import java.util.Scanner;
public class func_p2 {
//    Define a program to find out whether a given number is even or odd.
    public static String check(int a){
        String check = "even";
        if( a%2==0){
            check = "even";
        }
        else{
            check ="odd";
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("The number you entered is "+check(a));
    }

}

