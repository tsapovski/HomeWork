package com.overone.blok8.lesson26;

import java.util.Arrays;

public class Student {
    private String family;
    private String name;
    private int[] marks;

    public Student(String family, String name, int[] marks) {
        this.family = family;
        this.name = name;
        this.marks = marks;
    }
    public double averageScore (){
        int count = 0;
        int res = 0;
        for (int i = 0; i <this.marks.length ; i++) {
            res += marks[i];
            count++;
        }
        return  (double)res/count;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", number=" + Arrays.toString(marks) +
                '}';
    }
}
