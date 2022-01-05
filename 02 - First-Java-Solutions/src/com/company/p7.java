package com.company;

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
//        To calculate Fibonacci Series up to n numbers.
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of N :  ");
            int n = sc.nextInt();
            int n1=0,n2=1,n3,i;
            int count=n;
            int sum=1;
            System.out.print(n1+" "+n2);

            for(i=2;i<count;++i)
            {
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
                sum += n3;
            }
            System.out.print("\n Sum of N's number of term in fibonacci Series : "+sum);
    }
}
