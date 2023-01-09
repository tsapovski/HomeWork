package com.overone.blok19InputOutput.lesson114;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        System.out.printf("Length: %s \n", str2.length());
        System.out.println("Length: " + str1.length());
        System.out.print("Length: " + str3.length());
    }
}
