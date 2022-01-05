package com.company;
import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {
        //        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the Operation : (a for add \n s for subtract \n m for multiplication \n d for divide ");
        char o = sc.next().charAt(0);
        if(o=='a'){
            int add = a+b;
            System.out.println("Add of that two numbers are : "+add);
        }
        else if (o=='s'){
            if(a<b){
                int sub1 = b-a;
                System.out.println("The differnece between these two number are : "+sub1);
            }
            else {
                int sub2 = a-b;
                System.out.println("The differnece between these two number are : "+sub2);
            }
        }
        else if (o=='m'){
            int mul = a*b;
            System.out.println("The multiplication of these two number are : "+mul);
        }
        else {
            if(a<b){
                int div = b/a;
                System.out.println("The division of these two number are : "+div);
            }
            else{
                int div1 = a/b;
                System.out.println("The Division of these two number are : "+div1);
            }
        }
    }
}
