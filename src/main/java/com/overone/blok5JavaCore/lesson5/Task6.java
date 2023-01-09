package com.overone.blok5JavaCore.lesson5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* стоимость за 1 килограмм*/
        int money1 = scanner.nextInt();
        int money2 = scanner.nextInt();
        /* количество денег в наличии*/
        int money3 = scanner.nextInt();
        int money4 = scanner.nextInt();
        /* необходимое ко-во килограмм*/
        int needWeight = scanner.nextInt();
        scanner.close();

        int coin1 = money1*100 + money2;
        int coin2 = money3*100 + money4;

        if(coin2 >= coin1 * needWeight){
            System.out.println("Хватит");
        }else
            System.out.println("Не хватит");

    }
}
