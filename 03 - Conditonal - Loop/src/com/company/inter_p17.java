package com.company;
import java.util.Scanner;
public class inter_p17 {
    public static void main(String[] args) {
//        Reverse A String In Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word : ");
        String str= sc.nextLine(), nstr="";
        char ch;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);
    }
}
