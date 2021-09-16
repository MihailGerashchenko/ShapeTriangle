package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangularTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Test perimeter of triangular")
    void TestSquareParametres() {
        final Shape triangular = new Triangular(new Point(3, 4), new Point(5, 12), new Point(8, 4));
        Assertions.assertAll(
                () -> assertEquals(10.895107498276426, triangular.perimeter()),
                () -> assertEquals(20.0, triangular.square()));
    }
}