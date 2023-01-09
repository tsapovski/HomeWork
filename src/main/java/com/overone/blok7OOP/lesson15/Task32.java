package com.overone.blok7OOP.lesson15;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Первая часть домашнего задания*/
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        char[] charArray;
        String temp = "";
            for (int i = 0; i < strings.length-1; i++) {
                if (strings[i].length()>strings[i+1].length()){
                    temp = strings[i];
                    System.out.println(temp);
                }
            }
        System.out.println("*********************************");
        /*Вторая часть домашнего задания*/
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();
        String[] strings1 = str1.split(" ");
        String[] strings2 = str2.split(" ");
        boolean result =false;
        for(int i=0;i<strings1.length-1;i++){
            for(int j=0;j<strings2.length-1;j++){
                if(!strings1[i].equals(strings2[j])){
                    result=false;
                }
                else{
                    result=true;
                }
            }
        }
        if(result){
            System.out.println("The first line is present in the second line");
        }
        else{
            System.out.println("The first line is't present in the second line");
        }
    }
}
