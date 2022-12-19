package com.overone.blok5.lesson5;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int number1 = scanner.nextInt();
	    int number2 = scanner.nextInt();
	    int number3 = scanner.nextInt();
	    scanner.close();

	    if(number1 == number2 && number1 == number3 ){
            System.out.println("3");
        }else if(number1 == number2 || number1 == number3 || number2 == number3){
            System.out.println("2");
        }else
            System.out.println("0");
    }
}
