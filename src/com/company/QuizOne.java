package com.company;

import java.util.Scanner;

public class QuizOne {
    /* prints odd numbers the number the user inputs
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int oddNumbers[] = null;
        int j = 1;
           System.out.println("enter the number of odd numbers you wish to display:");
           int request = scanner.nextInt();
           if (request > 0) {
               for (int i = 1; i <= request; i++) {
                   System.out.println(j + "");
                   j = j + 2;
               }
           }
       }
    }