package com.overone.blok7OOP.lesson15;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        char[] charArray;
        String temp = "";
            if(!str.equals("")){
              for (int i = 0; i < strings.length; i++) {
              temp = strings[i];
              charArray = temp.toCharArray();
                if (charArray[0] == charArray[charArray.length - 1]) {
                  temp = new String(charArray);
                    System.out.print(temp + " ");
                      }
                    }
            }else
                System.out.println("Incorrect enter");



    }
}
   // lowercase lettel