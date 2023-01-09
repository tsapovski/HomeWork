package com.overone.blok19InputOutput.lesson124_125;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int numberPhone = scanner.nextInt();
        scanner.close();
        System.out.printf("Пользователя зовут %s %s . Его номер телефона - %d ", firstName, lastName, numberPhone);
    }
}
