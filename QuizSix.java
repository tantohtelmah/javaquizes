package com.company;

import com.sun.tools.javac.Main;

import java.util.Locale;
import java.util.Scanner;

public class QuizSix {
    /* this example shows hoe to use
    a nested list and perform basic arithmetics
     */
    public static int toAdd(int a, int b){
        // This method adds two intergers
        int addAnswer = a + b;
        System.out.println("The answer is "+addAnswer);
        return addAnswer;
    }
    public static int toSubtract(int c, int d){
        // This method subtracts two intergers
        int subAnswer = c - d;
        System.out.println("The answer is "+subAnswer);
        return subAnswer;
    }
    public static int toMultiply(int e, int f){
        // This method multiplies two intergers
        int multAnswer = e*f;
        System.out.println("The answer is "+multAnswer);
        return multAnswer;
    }
    public static double toDivide(double g, double h){
        //This method divides two doubles
        double divideAnswer = g/h;
        System.out.println("The answer is "+divideAnswer);
        return divideAnswer;
    }

    public static void main(String[] args){
        Scanner request = new Scanner(System.in);
        QuizSix trial = new QuizSix();

        //The nested loop
        while (true) {
            System.out.println("enter the type of operation needed");
            String requestAnswer = request.nextLine();
            if (requestAnswer.toLowerCase(Locale.ROOT).equals("addition")) {
                System.out.println("enter two integers:");
                int a = request.nextInt();
                int b = request.nextInt();
                toAdd(a, b);
            } else if (requestAnswer.toLowerCase(Locale.ROOT).equals("subtraction")) {
                System.out.println("enter two integers:");
                int c = request.nextInt();
                int d = request.nextInt();
                toSubtract(c, d);
            } else if (requestAnswer.toLowerCase(Locale.ROOT).equals("multiplication")) {
                System.out.println("enter two integers:");
                int e = request.nextInt();
                int f = request.nextInt();
                toMultiply(e, f);
            } else if (requestAnswer.toLowerCase(Locale.ROOT).equals("division")) {
                System.out.println("enter two doubles:");
                double g = request.nextDouble();
                double h = request.nextDouble();
                toDivide(g, h);
            } else if (requestAnswer.toLowerCase(Locale.ROOT).equals("none")){
                System.out.println("bye");
                break;
            }else {
                System.out.println("the operation entered is out of range");
        }
    }
}}
