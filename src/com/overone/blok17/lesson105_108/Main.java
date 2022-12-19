package com.overone.blok17.lesson105_108;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Objects;
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
