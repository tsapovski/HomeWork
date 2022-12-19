package com.overone.blok6.lesson8;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int power = scanner.nextInt();
        scanner.close();
        int res = number;
        for (int i = 1; i < power; i++) {
            if (power!=0){
                res *=power;
            }
        }
        System.out.println(res);
    }
}
