package com.overone.blok6.lesson11_12;


import java.util.Scanner;


public class Task22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<= min){
                min = arr[i];
                index = i;
            }
        }
        System.out.println(min + " "+ index);
    }
}

