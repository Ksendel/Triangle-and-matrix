package com.company.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void triangle() {
        int height = 3;
        int[][] triangle3 = new int[][]{
                new int[] {1},
                new int[] {1,2,1},
                new int[] {1,2,3,2,1}
        };

        assertArrayEquals(Task1.triangle(height), triangle3);
    }
}