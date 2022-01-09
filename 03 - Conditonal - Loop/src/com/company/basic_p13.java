package com.company;
import java.util.Scanner;
public class basic_p13 {
    public static void main(String[] args) {
//        Perimeter Of Rhombus
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Diagonals of Rhombus : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float per = (a*b)/2;
        System.out.println("Perimeter Of Rhombus is "+per+" unit");
    }
}
