package com.overone.blok12.lesson63_67;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student student = new Student("Fedya", "1B", 2, new int[]{2, 3, 4, 5, 6});
        Student student1 = new Student("Vasya", "2B", 2, new int[]{2, 1, 2, 2, 3});
        Student student2 = new Student("Advard", "1B", 2, new int[]{2, 3, 6, 5, 7});
        Student student3 = new Student("Sergo", "4B", 3, new int[]{1, 1, 3, 2, 1});
        Student student4 = new Student("Sasha", "5B", 3, new int[]{5, 3, 8, 9, 3});
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        averageScore(list);
        printStudent(list,3);

    }

    public static  void averageScore (List<Student> list) {
        int count = 0;
        int res = 0;
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            for (int j = 0; j < student.getMarks().length; j++) {
                res += student.getMarks()[j];
                count++;
            }
                if (res / count < 3) {
                    iterator.remove();
                } else if (res / count >= 3) {
                    int course = student.getCourse() + 1;
                    student.setCourse(course);
                }
            res = 0;
            count = 0;
        }
    }

    public static void printStudent (List < Student > students, int curse){
       for (Student st : students) {
           if (st.getCourse() == curse) {
               System.out.println(st.getName() + st.getCourse());
           }
       }

    }
}