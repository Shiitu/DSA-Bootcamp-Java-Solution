package com.company;
import java.util.Scanner;
public class inter_p3 {
    public static void main(String[] args) {
//        Calculate Average Of N Numbers
        System.out.println("Enter the number of last term : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i<=n; i++){
            sum = (sum+i);
        }
        int avg = sum/n;
        System.out.println(+avg);
    }
}
