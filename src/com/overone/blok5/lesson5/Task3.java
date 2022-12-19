package com.overone.blok5.lesson5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        scanner.close();

        if(number1%2!=0){
            System.out.println("1");
        }else if(number2%2!=0){
            System.out.println("2");
        }else if (number3%2!=0)
            System.out.println("3");
    }
    }

