package com.overone.blok5JavaCore.lesson5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* текущее время*/
        int time1 = scanner.nextInt();
        int time2 = scanner.nextInt();
        /* начало рабочей смены*/
        int time3 = scanner.nextInt();
        int time4 = scanner.nextInt();
        /* время за которе нужно добраться до работы*/
        int time5 = scanner.nextInt();
        int time6 = scanner.nextInt();
        scanner.close();

        int min1 = time1*60 + time2;

        int min2 = time3*60 + time4;

        int min3 = time5*60 + time6;


        if(min2 - min1 < min3){
            System.out.println("Не успеете");
        }else
            System.out.println("Успеете");

    }
}
