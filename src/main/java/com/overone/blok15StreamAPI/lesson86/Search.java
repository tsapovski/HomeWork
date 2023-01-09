package com.overone.blok15StreamAPI.lesson86;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        SearchFunction search = (int[] arr1) -> {
            int firstMax = arr1[0];
            int secondMax = arr1[0];
            int fistIndex = 0, secondIndex = 0;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] > firstMax) {
                    secondMax = firstMax;
                    firstMax = arr1[i];
                    secondIndex = fistIndex;
                    fistIndex = i;
                }
            }
            return arr1[secondIndex];
        };

        int res = search.searchSecondMaxElement(arr);
        System.out.println(res);
    }
}
