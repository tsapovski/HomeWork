package com.overone.blok8FeaturesOOP.lesson26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter family student:");
    String family = scanner.nextLine();
        System.out.println("Enter name student:");
    String name = scanner.nextLine();
        System.out.println("Enter quantity  marks :");
    int [] marks = new int[8];
        for (int i = 0; i < marks.length; i++) {
                marks[i]= scanner.nextInt();
        }
        scanner.close();
    Student student = new Student(family, name, marks);
        System.out.println(student.averageScore());

    }
}
