package com.company;
import java.util.Scanner;
public class basic_p16 {
    public static void main(String[] args) {
//        Volume Of Prism
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base of prism : ");
        float b = sc.nextFloat();
        System.out.println("Enter the height of prism : ");
        float h = sc.nextFloat();
        double vol = b*h;
        System.out.println("Volume Of Prism having base area "+b+" & height "+h+" is "+vol);

    }

}
