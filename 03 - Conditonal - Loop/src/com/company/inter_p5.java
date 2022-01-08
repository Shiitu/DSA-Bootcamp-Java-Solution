package com.company;
import java.util.Scanner;
public class inter_p5 {
    public static void main(String[] args) {
//        Calculate Distance Between Two Points
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First coordinate : ");
        System.out.print("x1 = ");
        int x1 = sc.nextInt();
        System.out.print("y1= ");
        int y1 = sc.nextInt();
        System.out.println("Enter the second coordinate : ");
        System.out.print("x2 = ");
        int x2 = sc.nextInt();
        System.out.print("y2 = ");
        int y2 = sc.nextInt();
        double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("The Distance between these points are : "+distance);

    }
}
