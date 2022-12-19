package com.overone.blok5.lesson5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        scanner.close();

        if (x*x + y*y == z*z || x*x + z*z == y*y || y*y + z*z == x*x ){
            System.out.println("может быть.");
      } else
            System.out.println("не может быть.");
    }
}
