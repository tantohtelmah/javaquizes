package com.company;

import java.util.Scanner;

public class QuizThree {
    //the multiplication table from one to ten
    //using switch case
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the multiplication table you wish to see");
        int table = scanner.nextInt();
        switch (table){
            case 1:
                for (int i = 0; i<=12;i++){
                    System.out.println("1 * "+i+ " = "+i );
                }break;
            case 2:
                for (int i = 0; i<=12;i++){
                    System.out.println("2 * "+i+ " = "+2*i );
                }break;
            case 3:
                for (int i = 0; i<=12;i++){
                    System.out.println("3 * "+i+ " = "+3*i );
                }break;
            case 4:
                for (int i = 0; i<=12;i++){
                    System.out.println("4 * "+i+ " = "+4*i );
                }break;
            case 5:
                for (int i = 0; i<=12;i++){
                    System.out.println("5 * "+i+ " = "+5*i );
                }break;
            case 6:
                for (int i = 0; i<=12;i++){
                    System.out.println("6 * "+i+ " = "+6*i );
                }break;
            case 7:
                for (int i = 0; i<=12;i++){
                    System.out.println("7 * "+i+ " = "+7*i );
                }break;
            case 8:
                for (int i = 0; i<=12;i++){
                    System.out.println("8 * "+i+ " = "+8*i );
                }break;
            case 9:
                for (int i = 0; i<=12;i++){
                    System.out.println("9 * "+i+ " = "+9*i );
                }break;
            case 10:
                for (int i = 0; i<=12;i++){
                    System.out.println("10 * "+i+ " = "+10*i );
                }break;

            default:
                System.out.println("sorry");
                break;
        }
    }
}
