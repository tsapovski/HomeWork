//package com.overone.blok21Testing;
//
//import java.util.*;
//
//public class User {
//    private int id;
//    private String name;
//    private int age;
//    private Sex sex;
//    private static Map<Integer, User> allUsers;
//    private static int countId = 0;
//
//    public User(String name, int age, Sex sex) {
//        if (allUsers == null) {
//            allUsers = new HashMap<>();
//        }
//
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//
//        if (!hasUser()) {
//            countId++;
//            this.id = countId;
//            allUsers.put(id, this);
//        }
//    }
//
//    public static List<User> getAllUsers() {
//        return new ArrayList<>(allUsers.values());
//    }
//
//    public static List<User> getAllUsers(Sex sex) {
//        List<User> listAllUsers = new ArrayList<>();
//        for (User user : allUsers.values()) {
//            if (user.sex == sex) {
//                listAllUsers.add(user);
//            }
//        }
//        return listAllUsers;
//    }
//
//    public static int geQuantityUsers() {
//        return allUsers.size();
//    }
//
//    public static int getQuantitySexUsers(Sex sex) {
//        return getAllUsers(sex).size();
//    }
//
//    public static int getAllAgeUsers() {
//        int countAge = 0;
//        for (User user : allUsers.values()) {
//            countAge += user.age;
//        }
//        return countAge;
//    }
//
//    public static int getAllAgeUsers(Sex sex) {
//        int countAge = 0;
//        for (User user : getAllUsers(sex)) {
//            countAge += user.age;
//        }
//        return countAge;
//    }
//
//    public static int getAverageAgeAllUsers() {
//        return getAllAgeUsers() / geQuantityUsers();
//    }
//
//    public static int getAverageAgeAllSexUsers(Sex sex) {
//        return getAllAgeUsers(sex) / getQuantitySexUsers(sex);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return age == user.age &&
//                Objects.equals(name, user.name) &&
//                sex == user.sex;
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(name, age, sex);
//    }
//
//    private boolean hasUser() {
//        for (User user : allUsers.values()) {
//            if (user.equals(this) && user.hashCode() == this.hashCode()) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", sex=" + sex +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public Sex getSex() {
//        return sex;
//    }
//}