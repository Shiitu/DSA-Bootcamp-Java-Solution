package com.company;
import java.util.Scanner;
public class inter_p15 {
    public static void main(String[] args) {
        int r,sum=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check : ");
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n = 10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
