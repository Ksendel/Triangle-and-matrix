package com.company.lab1;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.lab1.Task1.triangle;
import static com.company.lab1.Task1.triangleToString;

public class Task1App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of triangle from 1 to 9: ");
        int height = in.nextInt();

        int[][] tr = triangle(height);
        System.out.println(triangleToString(tr));
    }
}
