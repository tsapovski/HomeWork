package com.overone.blok6Strings.lesson13_14;
import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height matrix:");
        int height = scanner.nextInt();
        System.out.println("Enter length matrix:");
        int length = scanner.nextInt();
        scanner.close();

        int [][] matrix  = new int[height][length];

        int min = 0;
        int max = 20;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = (int)(Math.random()*((max-min)+1))+min;
            }
        }
        int multiplier = 3;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] *=multiplier;
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
