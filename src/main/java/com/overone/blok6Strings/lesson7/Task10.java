package com.overone.blok6Strings.lesson7;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int start = 1;

        while(start*start < number){
            System.out.println(start*start);
            start++;


        }
    }
}
