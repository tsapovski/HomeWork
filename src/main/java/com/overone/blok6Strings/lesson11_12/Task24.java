package com.overone.blok6Strings.lesson11_12;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        int count = 0;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i] == arr[i+1]&& arr[i]!=arr[i+2]){
                count++;
            }
        }
        System.out.println(count);


    }
}
