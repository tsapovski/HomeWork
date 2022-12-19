package com.overone.blok6.lesson7;


import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int preNum = scanner.nextInt();
        int number = scanner.nextInt();
        int postNum = scanner.nextInt();
        String  temp = " ";
        /*решил, раз уж для, существования максимума,
        по обе стороны должны быть не ноли, то такая проверка имеет место быть.*/
        if( preNum !=0 || number !=0 || postNum !=0){

            if(preNum < number && number > postNum)
                temp += "\n" +number;
            while (postNum!=0) {
                preNum = number;
                number = postNum;
                postNum = scanner.nextInt();
                if(preNum < number && number > postNum)
                temp += "\n"+number;

            }
        }
        System.out.println(temp);

    }
}
