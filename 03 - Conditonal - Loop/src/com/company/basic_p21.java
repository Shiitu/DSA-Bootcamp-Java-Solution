package com.company;
import java.util.Scanner;
public class basic_p21 {
    public static void main(String[] args) {
//        Fibonacci Series In Java Programs
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Series ");
        System.out.println("Enter the last term in Fibonacci Series : ");
        int n = sc.nextInt();
        int n1, n2, n3;
        n1 = 0;
        n2 = 1;
        System.out.print(n1+"\t"+n2);
        for (int i =2; i<n; i++){
            n3 = n1+n2;
            System.out.print("\t"+n3);
            n1=n2;
            n2=n3;
        }
    }
}
