package com.overone.blok7OOP.lesson9;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberN = scanner.nextInt();
        int numberA = scanner.nextInt();
        int res =0;
        for (int i = 1; i <= numberA ; i++) {
            res = (int) (Math.random()*(numberN-(-numberN)))+ (-numberN);
            System.out.print(res +" ");
        }

    }
}
