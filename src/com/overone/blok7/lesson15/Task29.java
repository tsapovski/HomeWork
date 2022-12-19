package com.overone.blok7.lesson15;

import java.util.Arrays;
import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String search = scanner.nextLine();
        char[] searchChar = str.toCharArray();
        System.out.println(Arrays.toString(searchChar));
            int count = 0;
        for (int i =0; i < searchChar.length; i++ ){
            if (search.equals(Character.toString(searchChar[i]))){
                count++;
            }
        }
        System.out.println(count);
    }
}
