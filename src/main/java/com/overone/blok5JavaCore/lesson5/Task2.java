package com.overone.blok5JavaCore.lesson5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /* расположение первой клетки */
        int number1 = scanner.nextInt();/* номер столбца*/
        int number2 = scanner.nextInt();/* номер строки*/
        /* расположение второй клетки */
        int number3 = scanner.nextInt();/* номер столбца*/
        int number4 = scanner.nextInt();/* номер строки*/
        scanner.close();

        if (number1 == number3 || number2 == number4){
            System.out.println("Ладья может переместиться за один ход");
        }else{
            System.out.println("Ладья не может переместиться за один ход");
        }
    }
}
