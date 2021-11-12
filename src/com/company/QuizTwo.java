package com.company;

import java.util.Scanner;

public class QuizTwo {
    //square root of a given number
    public static void main (String[] args){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find the square root:");
       double number = input.nextInt();
        System.out.println("the answer is "+ Math.sqrt(number));
    }
}
