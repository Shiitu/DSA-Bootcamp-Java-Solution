package com.company;
import java.util.Scanner;
public class inter_p6 {
    public static void main(String[] args) {
//        Calculate Commission Percentage
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount : ");
        int a = sc.nextInt();
        System.out.println("Enter percent of commission : ");
        float b = sc.nextInt();
        double  c = (b/100)*a;
        System.out.println("Comission of "+a+" is "+c);
    }
}
