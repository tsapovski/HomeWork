package com.overone.blok6.lesson7;

import java.util.Scanner;

public class Task13Prakt7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = number;
        while (number != 0){
            number = scanner.nextInt();
            sum += number*number;
        }
        System.out.println(sum);
    }
}
