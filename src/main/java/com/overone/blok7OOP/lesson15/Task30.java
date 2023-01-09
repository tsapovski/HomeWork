package com.overone.blok7OOP.lesson15;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {

        /*задача из задания на портале*/
        Scanner scanner = new Scanner(System.in);
        String  str = scanner.nextLine();
        char ch = str.charAt(0);
                if(ch>=48 && ch<=57){
                    System.out.println("Digital");
                    if (ch%2==0){
                        System.out.println("Even");
                    }else{

                        System.out.println("Not even");
                    }
        }else{
                    System.out.println("Not Digital");
                }
        /*задача из задания в видео*/
         char ch2 = scanner.next().charAt(0);
                    scanner.close();
                if (ch2>=65 && ch2 <=90){
                    System.out.println("Capital letter");
                    System.out.println(Character.toString(ch2).toLowerCase());
                }else if (ch2>=97 && ch2 <=122){
                    System.out.println("lowercase letter");
                    System.out.println(Character.toString(ch2).toUpperCase());
                }

    }
}
