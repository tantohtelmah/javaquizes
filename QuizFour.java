package com.company;

import java.util.Scanner;

public class QuizFour {
    /* checking if the year requested by the user
    is a leap year.
     */
    public static void testYear(int year){
        if(year % 4 == 0){
            System.out.println(year + " is a leap year.");
        }else {
            System.out.println(year + " is not a leap year.");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        testYear(year);
    }
}
