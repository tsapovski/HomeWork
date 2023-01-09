package com.overone.blok6Strings.lesson13_14;
import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height matrix:");
        int height = scanner.nextInt();
        System.out.println("Enter length matrix:");
        int length = scanner.nextInt();

        int [][] matrix  = new int[height][length];
        System.out.println("Enter the array's values");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < height; i++)
            for (int j = 0; j <length ; j++)
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                }
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < height; i++)
            for (int j = 0; j <length ; j++)
                if (matrix[i][j] == max ) {
                    if (index1>i&&index2>j)
                    index1 = i;
                    index2 = j;
                }
        System.out.println(index1 + " " + index2);
    }
}
