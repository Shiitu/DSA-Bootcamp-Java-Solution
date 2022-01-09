package com.company;
import java.util.Scanner;
public class basic_p5 {
    public static void main(String[] args) {
//        Area Of Parallelogram
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of Parallelogram : ");
        float b = sc.nextFloat();
        System.out.println("Enter the height of Parallelogram or distance btw opposite side : ");
        float h = sc.nextFloat();
        double area = b*h;
        System.out.println("Area og Parallelogram having base "+b+" & height "+h+" is "+area+" sq. unit");
    }
}
