package org.example;

import java.util.Scanner;

import static org.example.TriangleChecker.determineTriangleType;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three non-negative integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String result = determineTriangleType(a, b, c);
        System.out.println("Triangle type: " + result);
    }
}