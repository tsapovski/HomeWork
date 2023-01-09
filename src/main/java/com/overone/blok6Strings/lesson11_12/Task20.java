package com.overone.blok6Strings.lesson11_12;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0;i< arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length-1 ; i++) {
                   if (arr[i+1] == arr[i]){
                       System.out.println(arr[i+1]);

                   }

                }
            }
        }

