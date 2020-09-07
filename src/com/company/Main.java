package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of triangle from 1 to 9: ");
        int height = in.nextInt();

        int[][] tr = triangle(height);
        System.out.println(triangleToString(tr));
    }

    public static int[] rowNums(int row) {
        int rowSize = row * 2 + 1;
        int middle = row + 1;
        int[] nums = new int[rowSize];

        for (int i = 0; i < rowSize; i++) {
            if (i >= middle) {
                nums[i] = rowSize - i;
            } else {
                nums[i] = i + 1;
            }
        }
        return nums;
    }

    public static int[][] triangle(int height) {
        int[][] arr = new int[height][];

        for (int i = 0; i < height; i++) {
            arr[i] = rowNums(i);
        }
        return arr;
    }

    public static String triangleToString(int[][] triangle) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < triangle.length; i++) {
            char[] spaces = new char[triangle.length * 2 - 2 * i];
            Arrays.fill(spaces, ' ');

            sb.append(String.valueOf(spaces));

            for (int j = 0; j < triangle[i].length; j++) {
                sb.append(triangle[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
