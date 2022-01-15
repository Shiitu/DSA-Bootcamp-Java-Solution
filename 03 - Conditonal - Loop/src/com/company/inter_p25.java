package com.company;

public class inter_p25 {
    public static void main(String[] args) {
//        Kunal is allowed to go out with his friends only on the even
//        days of a given month. Write a program to count the number of days he can go out in the month of August
        int days = 31;
        int count =1;
        for (int i = 1; i<=days;i++){
            if (i%2==0) {
                ++count;
            }
        }
        System.out.println("Number of day he can go out in the month of august : "+count);
    }
}
