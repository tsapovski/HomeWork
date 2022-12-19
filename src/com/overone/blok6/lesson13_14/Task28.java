package com.overone.blok6.lesson13_14;

import java.util.Scanner;

public class Task28 {
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
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        int row = scanner.nextInt();
        scanner.close();
        System.out.println("***************");
        int[] reversRow = new int[height];
        int count = 0;
        for (int i = 0; i < height; i++) {
            reversRow[i] = matrix[row][i];
        }
        int[] temp = new int[height];
        for (int i = reversRow.length-1; i >=0; i--, count++) {
            temp[count] = reversRow[i];
        }
        for (int i = 0; i <matrix.length ; i++) {
            matrix[row][i] = temp[i];
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        }

    }

