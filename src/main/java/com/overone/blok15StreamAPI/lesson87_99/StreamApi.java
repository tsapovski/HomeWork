package com.overone.blok15StreamAPI.lesson87_99;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        System.out.println("Task №1 ************************");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("James"));
        employees.add(new Employee("Valery"));
        employees.add(new Employee("Black"));
        employees.add(new Employee("Depp"));
        employees.add(new Employee("Blum"));
        employees.add(new Employee("Jc"));


        Stream<Employee> stream = employees.stream();
        Stream<Employee> resStream = stream.filter(employee -> employee.getLastname().charAt(0) == 'J');
        resStream.forEach(employee -> System.out.println(employee.getLastname()));

        System.out.println("Task №2 ************************");
        List<String> list = new ArrayList<>();
        list.add("James");
        list.add("Valery");
        list.add("Black");
        list.add("Depp");
        list.add("Blum");
        list.add("Jc");

        Stream streamList = list.stream();
        streamList.sorted().forEach(System.out::println);



    }
}
