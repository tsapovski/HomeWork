package com.overone.blok17Exceprion.lesson105_108;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = 0, b = 0;
            try {
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                System.out.println(a/b);
            }catch (InputMismatchException  | ArithmeticException e){
               if (e.getMessage() == null){
                   System.out.println("Вы ввели не число, повторите ввод");
               }else
                   System.out.println("на ноль делить нельзя");

            }

    }

}
