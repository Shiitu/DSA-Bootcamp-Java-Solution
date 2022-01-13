package com.company;

import java.util.Scanner;

public class inter_p16 {
    public static void main(String[] args) {
//        Find Ncr & Npr
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N : ");
        int N = sc.nextInt();
        System.out.println("Enter the value of r : ");
        int r = sc.nextInt();
        int factn = 1;
        for(int i =1; i<=N;i++){
            factn = factn*i;
        }
        int factr = 1;
        for (int i =1; i<=r;i++){
            factr = factr*i;
        }
        int d = N-r;
        int factd = 1;
        for (int i=1; i<=d;i++){
            factd = factd*i;
        }
        float p = (factn)/(factd);
        System.out.println("Permutation of giving inputs :  "+p);
        float c = (factn)/(factr*factd);
        System.out.println("Combination os giving inputs : "+c);

    }
}
