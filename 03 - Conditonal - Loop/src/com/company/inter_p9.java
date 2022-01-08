package com.company;
import java.util.Scanner;
public class inter_p9 {
    public static void main(String[] args) {
//        Calculate Batting Average
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of inings : ");
        int n = sc.nextInt();
        int[] c = new int[n];
        System.out.println("Enter your Runs per inings in "+n+ " inings");
        for (int i =0; i<n;i++){
            c[i]= sc.nextInt();

        }
        System.out.println("Your run :");
        for (int i =0; i<n; i++){
            System.out.println(" "+c[i]);
        }
        int sum=0;
        for (int i =0; i<n; i++){
            sum = sum +c[i];
        }
        int avg = sum/n;
        System.out.println("Batting Average is "+avg);
    }
}
