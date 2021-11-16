package com.company;

import java.util.Scanner;

public class QuizSeven {
    //this is check if a number entered by a user is a palindrome
    public static void palindrome(int number){
        int x = number;
        int reverse = 0;
        while(x>0){
            reverse = reverse*10;
            reverse += x%10;
            x =x/10;
        }
        if (number==reverse){
            System.out.println(number+" is a palindrome number");
        }else {
            System.out.println(number+" is not a palindrome");
        }
    }

    public static void main(String[] args){
        Scanner request = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = request.nextInt();
        palindrome(number);
    }
}
