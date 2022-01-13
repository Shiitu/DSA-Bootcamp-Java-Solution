package com.company;
import java.util.Scanner;
public class inter_p21 {
    public static void main(String[] args) {
//        Vowel Or Consonant
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character : ");
        char ch = sc.next().charAt(0);
        if (ch =='a' || ch=='e' || ch=='i' || ch=='0' || ch=='u'){
            System.out.println(""+ch+" is a Vowel.");
        }
        else{
            System.out.println(""+ch+" is Consonant");
        }
    }
}
