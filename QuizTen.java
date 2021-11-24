package com.company;

import java.util.Scanner;

public class QuizTen {
    public static void main(String[] args) {
        double raduis = 0.0;
        double area = 0.0;
        double circumference = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the raduis of the circle(in cm):");
        raduis = scanner.nextDouble();
        area = (22 * raduis * raduis) / 7.0;
        circumference = (22 * raduis) / 7.0;
        System.out.println("Area of cicle = " + area + "sq.cm");
        System.out.println("Circumference of the circle " + circumference + "cm");
    }
}
