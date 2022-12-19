package com.overone.blok7.lesson9;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        scanner.close();
        int res = -1*numberB/numberA;
        System.out.println(res);

    }
}
