package com.overone.blok15.lesson86;

import java.util.Scanner;

public class Lyamda {
    public static void main(String[] args) {

        Function fun = (int a, int b, String doing) -> {

            double value = switch (doing) {
                case ("+"):
                    yield a + b;
                case ("-"):
                    yield a - b;
                case ("*"):
                    yield a * b;
                case ("/"):
                    yield a / b;
                default:
                    yield 0;
            };
            System.out.println(value);
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи знак действия");
        String str = scanner.nextLine();

        System.out.println("Введи первое число");
        int a = scanner.nextInt();

        System.out.println("Введи второе число");
        int b = scanner.nextInt();

        fun.calculate(a, b, str);

    }
}
