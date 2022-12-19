package com.overone.blok6.lesson8;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int sumFor = 0;
        int sumWhile = 0;
        for (int i = 1; i <=number ; i++) {
            if (i%2==0){
                sumFor +=i;
            }
        }
        System.out.println("Sum realization through For : = " + sumFor);
        int count = 1;
        while (count <= number){
            if (count%2==0){
                sumWhile +=count;
            }
            count++;
        }
        System.out.println("Sum realization through While : = " + sumWhile);

    }
}
