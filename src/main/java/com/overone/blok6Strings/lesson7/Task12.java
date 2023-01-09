package com.overone.blok6Strings.lesson7;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scanner.nextInt();
        System.out.println("Enter the degree of exposure :");
        int degree = scanner.nextInt();
        scanner.close();
        long temp = number;
        int count1 = 1;
        if (degree > 0){
            while (count1 != degree){
                number *=temp;
                count1++;
             }
          System.out.println(number);
        }else if (degree<0){
            while (degree != -1){
                number *=temp;
                degree++;
            }
            System.out.println((double) 1/number);
        }

    }
}
