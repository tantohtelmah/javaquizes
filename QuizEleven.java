package com.company;

import java.util.Scanner;

public class QuizEleven {
    public static void main(String[] args) {
        double base = 0.0;
        double height = 0.0;
        double area = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the base and the height of the triangle(in cm):");
        base = scanner.nextDouble();
        height = scanner.nextDouble();
        area = (base*height) / 2.0;
        System.out.println("Area of triangle = " + area + "sq.cm");
    }
}
