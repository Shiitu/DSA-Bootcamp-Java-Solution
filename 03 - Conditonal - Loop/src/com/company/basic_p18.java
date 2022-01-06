package com.company;
import java.util.Scanner;
public class basic_p18 {
    public static void main(String[] args) {
//        Volume Of Pyramid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base's width of Pyramid : ");
        float w = sc.nextFloat();
        System.out.println("Enter the base's length of pyramid : ");
        float l = sc.nextFloat();
        System.out.println("Enter the height of Pyramid : ");
        float h = sc.nextFloat();
        double vol = (w*l*h)/3;
        System.out.println("Volume Of Pyramid having base's width "+w+" Length "+l+" & height "+h+" is ");
    }
}
