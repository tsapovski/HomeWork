package com.overone.blok5.lesson5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        scanner.close();
        int temp;
        if (number1 <= number2){
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2<=number3){
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if (number1 <= number2){
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println(number1 + " " + number2 + " " + number3 );
    }
}
