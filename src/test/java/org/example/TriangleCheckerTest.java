package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TriangleCheckerTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0, Not a triangle",   // Все стороны равны нулю
            "1, 1, 1, Equilateral",      // Все стороны равны
            "2, 2, 3, Isosceles",        // Две стороны равны
            "3, 4, 5, Scalene",          // Все стороны разные
            "1, 2, 3, Not a triangle",   // Не выполняется неравенство треугольника
            "5, 5, 10, Not a triangle",  // Не выполняется неравенство треугольника
            "-1, 2, 3, Not a triangle",  // Отрицательная длина стороны
            "1, 1, -1, Not a triangle",  // Отрицательная длина стороны
            "1000000, 1000000, 1000000, Equilateral", // Большой равносторонний
            "1000000, 1000000, 999999, Isosceles" // Большой равнобедренный
    })
    void testTriangleChecker(int a, int b, int c, String expectedResult) {
        String actualResult = TriangleChecker.determineTriangleType(a, b, c);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
