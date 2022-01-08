package com.company;
import java.util.Scanner;
public class inter_p14 {
    public static void main(String[] args) {
//        Sum Of N Numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the last term you want to write : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i =0; i<n;i++){
            sum = sum +i;
        }
        System.out.println("Sum Of "+n+ " Numbers is "+sum);
    }
}
