package com.company.lab1;

import java.util.Random;

public class Task2 {

    public static int[][] randomMatrix (int n) {

        int[][] array = new int[n][n];

        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = rd.nextInt(9);
            }
        }
        return array;
    }

    public static int[][] turnMatrix (int [][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[matrix[i].length - j - 1][i] = matrix[i][j];
            }

        }
        return newMatrix;
    }

    public static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

