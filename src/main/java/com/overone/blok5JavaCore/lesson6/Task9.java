package com.overone.blok5JavaCore.lesson6;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        char sign = scanner.next().charAt(0);
        scanner.close();

        switch (sign){

            case '+':
                System.out.println(number1+number2);
                break;
            case '-':
                System.out.println(number1-number2);
                break;
            case '*':
                System.out.println(number1*number2);
                break;
            case '/':
                System.out.println(number1/number2);
                break;
            case '%':
                System.out.println(number1%number2);
                break;
            default:
                System.out.println("Not correct sign");
                break;
        }

    }
}
