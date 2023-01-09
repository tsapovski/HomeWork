package com.overone.blok6Strings.lesson11_12;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0;i< arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < arr.length ; i++) {
            if (i%2==0){
                System.out.println(arr[i]);

            }

        }
    }
}


