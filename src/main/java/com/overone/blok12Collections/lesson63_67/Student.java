package com.overone.blok12Collections.lesson63_67;

public class Student {
    private String name;
    private String group;
    private int course;
    private int[] marks;

    public Student(String name, String group, int course, int[] marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}
