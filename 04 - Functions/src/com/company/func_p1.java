package com.company;
import java.util.Scanner;
public class func_p1 {
//    Define two methods to print the maximum and the minimum number respectively
//    among three numbers entered by the user.
    public static int max ( int a , int b, int c ){
        int large = a;
        if (large<b){
            large = b;
        }
        if (large<c){
            large = c;
        }
        return large;
    }
    public static int mini(int a, int b, int c){
        int small = a;
        if (small>b){
            small = b;
        }
        if (small>c){
            small=c;
        }
        return small;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third number : ");
        int c = sc.nextInt();
        int d = max(a,b,c);
        System.out.println("Largest Number in these numbers is : "+d);
        int e = mini(a,b,c);
        System.out.println("Smallest Number in these numbers is : "+e);
    }
}
