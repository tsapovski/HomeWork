package com.overone.blok6.lesson7;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
            int count = 2;
        while(count*count<=number){

            if(number%count==0){
                System.out.println(number/count);
                break;
            }
            count++;
        }

    }
}
