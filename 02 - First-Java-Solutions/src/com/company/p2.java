package com.company;
import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
//        Take name as input and print a greeting message for that name.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name = sc.nextLine();
        System.out.println("Hey "+name+" Good Morning have a great day !!!!");
    }
}
