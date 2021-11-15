package com.company;

import java.util.Scanner;

public class QuizFive {
    /* this will print a number in
    the reverse direction of a given number, n.
     */
    public static void reverseNumbers(int n){
        int x = n;
        int reverse = 0;
        while(x>0){
            reverse = reverse * 10;
            reverse += x%10;
            x = x/10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = input.nextInt();

        reverseNumbers(number);
    }
}
