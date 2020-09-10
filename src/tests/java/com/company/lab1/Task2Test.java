package com.company.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void turnMatrix() {
        int[][] matrix = new int[][] {
                new int[] {1, 2, 3},
                new int[] {4, 5, 6},
                new int[] {7, 8, 9}
        };
        int[][] matrix2 = new int[][] {
                new int[] {3, 6, 9},
                new int[] {2, 5, 8},
                new int[] {1, 4, 7}
        };

        assertArrayEquals(Task2.turnMatrix(matrix), matrix2);
    }
}