package com.overone.blok6.lesson11_12;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        double min = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0 && arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
        for (int i = 0; i <arr.length; i++) {
            arr[i] /= min;
            System.out.println(arr[i]);
        }

    }
}
