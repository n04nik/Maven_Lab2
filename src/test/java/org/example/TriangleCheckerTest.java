package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriangleCheckerTest {
    private TriangleChecker triangleChecker;

    @BeforeEach
    void setUp() {
        triangleChecker = new TriangleChecker();
    }

    @Test
    void testNotATriangleZeroSides() {
        String result = triangleChecker.determineTriangleType(0, 0, 0);
        Assertions.assertEquals("Not a triangle", result);
        System.out.println("Test 1 - PASS");
    }

    @Test
    void testEquilateralTriangles() {
        String result = triangleChecker.determineTriangleType(1, 1, 1);
        Assertions.assertEquals("Equilateral", result);
        System.out.println("Test 2 - PASS");
    }

    @Test
    void testIsoscelesTriangle() {
        String result = triangleChecker.determineTriangleType(2, 2, 3);
        Assertions.assertEquals("Isosceles", result);
        System.out.println("Test 3 - PASS");
    }

    @Test
    void testScaleneTriangle() {
        String result = triangleChecker.determineTriangleType(3, 4, 5);
        Assertions.assertEquals("Scalene", result);
        System.out.println("Test 4 - PASS");
    }

    @Test
    void testNotATriangleSumOfSides() {
        String result = triangleChecker.determineTriangleType(1, 2, 3);
        Assertions.assertEquals("Not a triangle", result);
        System.out.println("Test 5 - PASS");
    }

    @Test
    void testNotATriangleEqualSums() {
        String result = triangleChecker.determineTriangleType(5, 5, 10);
        Assertions.assertEquals("Not a triangle", result);
        System.out.println("Test 6 - PASS");
    }
}