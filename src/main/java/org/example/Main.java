package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.example.TriangleChecker.determineTriangleType;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Enter three non-negative integers: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();

                if (a < 0 || b < 0 || c < 0) {
                    System.out.println("Please enter non-negative integers only.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers only.");
                scanner.next();
            }
        }
        String result = determineTriangleType(a, b, c);
        System.out.println("Triangle type: " + result);
    }
}
