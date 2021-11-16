package com.company;

import java.util.Scanner;

public class QuizEight {
    //swapping numbers without a third variable
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number:");
        int firstNumber = scanner.nextInt();
        System.out.println("enter another number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Now, before the swap the first number is "+firstNumber+" and the second number is "+secondNumber);
        firstNumber= firstNumber+secondNumber;
        secondNumber=firstNumber-secondNumber;
        firstNumber=firstNumber-secondNumber;
        System.out.println("But, after the swap the first number is "+firstNumber+" and the second number is "+secondNumber);
    }
}
