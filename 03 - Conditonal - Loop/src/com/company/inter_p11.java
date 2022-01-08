package com.company;
import java.util.Scanner;
public class inter_p11 {
    public static void main(String[] args) {
//        Calculate CGPA Java Program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();
        System.out.println("Enter the marks of "+n);
        int []c= new int[n];
        for(int i =0; i<n;i++){
            c[i]=sc.nextInt();
        }
        System.out.println("Your marks are : ");
        for(int i=0; i<n;i++){
            System.out.println(" "+c[i]);
        }
        float sum =0;
        for (int i = 0; i<n; i++){
            sum = sum+c[i];
        }
        System.out.println("Sum of marks : "+sum);
        float per = (sum*100)/(100*n);
        System.out.println("Percentage of given number : "+per);
        double cgpa = per/9.5;
        System.out.println("YOur marks in CGPA : "+cgpa);


    }
}
