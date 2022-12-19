package com.overone.blok6.lesson13_14;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height matrix:");
        int height = scanner.nextInt();
        System.out.println("Enter length matrix:");
        int length = scanner.nextInt();


        int [][] matrix  = new int[length][height];
        int min = 0;
        int max = 10;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                matrix[i][j] = (int)(Math.random()*((max-min)+1))+min;
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter number string");
        int row = scanner.nextInt();
        scanner.close();
        int[] temp = new int[height];

        for (int i = 0; i < height; i++) {
            temp[i] = matrix[row][i];
        }
        System.out.println("************************************");
        int[][] matrix2 = new int[length+1][height];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0 ; j < matrix[i].length; j++) {
                matrix2[i][j] = matrix[i][j];
            }
        }

        int index = 0;
        for (int i = 0; i < length; i++) {
            if (matrix2[i].length > index) {
                index = i;
            }
            index++;
        }
        for (int i = 0; i <height; i++) {
            matrix2[index][i] = temp[i];
        }
        for (int i = 0; i < height; i++) {
            matrix2[i][i] = temp[i];
        }

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0 ; j < matrix2.length; j++) {

                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
