package com.company;

import java.util.Scanner;

public class QuizNine {
    public static void main(String[] args){
        double side = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lenght of the side of octagon(in cm):");
        side = scanner.nextDouble();
        area = 2*(1 + Math.sqrt(2))*side*side;
        perimeter = 8*side;
        System.out.println("Area of octagon = "+area+"sq.cm");
        System.out.println("Perimeter of octagon = "+perimeter+"cm");
    }
}
