package com.company.lab1;

import java.util.Random;
import java.util.Scanner;

import static com.company.lab1.Task2.*;

public class Task2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int n = in.nextInt();

        int[][] defaultMatrix = randomMatrix(n);
        printMatrix(defaultMatrix);
        System.out.println();
        printMatrix(turnMatrix(defaultMatrix));
    }

}