package com.overone.blok12.lesson_69;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorTask {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");list.add("B");list.add("C");list.add("D");list.add("E");list.add("F");list.add("G");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String str = listIterator.next();
            System.out.print(str + " ");

            listIterator.set(str);
        }
        System.out.print("\n");
        while (listIterator.hasPrevious()){
            String str = listIterator.previous();
            System.out.print(str + " ");
        }
        list.clear();
        if (list.isEmpty()){
            System.out.println("\n"+"Список пуст");
        }else
            System.out.println("\n"+"Список не пуст");

        }

    }

