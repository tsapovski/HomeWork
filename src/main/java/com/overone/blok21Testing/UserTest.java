//package com.overone.blok21Testing;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class UserTest {
//
//    private User user;
//    private User user1;
//    private User user2;
//    private User user3;
//    private User user4;
//    private User user5;
//    private User user6;
//    private User user7;
//    private User user8;
//
//
//    @Before
//    public void setUp() throws Exception {
//        user = new User("User", 10, Sex.MALE);
//        user1 = new User("User1", 11, Sex.MALE);
//        user2 = new User("User2", 12, Sex.MALE);
//        user3 = new User("User3", 13, Sex.MALE);
//        user4 = new User("User4", 14, Sex.MALE);
//        user5 = new User("User5", 15, Sex.MALE);
//        user6 = new User("User6", 16, Sex.FEMALE);
//        user7 = new User("User7", 17, Sex.FEMALE);
//        user8 = new User("User8", 18, Sex.FEMALE);
//    }
//
//    @Test
//    public void getAllUsers() {
//        List<User> expected = User.getAllUsers();
//
//        List<User> actual = new ArrayList<>();
//        actual.add(user);
//        actual.add(user1);
//        actual.add(user2);
//        actual.add(user3);
//        actual.add(user4);
//        actual.add(user5);
//        actual.add(user6);
//        actual.add(user7);
//        actual.add(user8);
//
//        Assert.assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void getAllUsers_NO_NULL() {
//        List<User> expected = User.getAllUsers();
//        Assert.assertNotNull(expected);
//    }
//
//    @Test
//    public void getAllUsers_MALE() {
//        List<User> expected = User.getAllUsers(Sex.MALE);
//
//        List<User> actual = new ArrayList<>();
//        actual.add(user);
//        actual.add(user1);
//        actual.add(user2);
//        actual.add(user3);
//        actual.add(user4);
//        actual.add(user5);
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void getAllUsers_MALE_NO_NULL() {
//
//        List<User> expected = User.getAllUsers(Sex.MALE);
//        Assert.assertNotNull(expected);
//    }
//
//    @Test
//    public void getAllUsers_FEMALE() {
//        List<User> expected = User.getAllUsers(Sex.FEMALE);
//
//        List<User> actual = new ArrayList<>();
//        actual.add(user6);
//        actual.add(user7);
//        actual.add(user8);
//
//
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void getAllUsers_FEMALE_NO_NULL() {
//
//        List<User> expected = User.getAllUsers(Sex.FEMALE);
//        Assert.assertNotNull(expected);
//    }
//
//    @Test
//    public void geQuantityUsers() {
//        int expected = User.geQuantityUsers();
//
//        int actual = 9;
//
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void geQuantityUsers_MALE() {
//        int expected = User.getQuantitySexUsers(Sex.MALE);
//
//        int actual = 6;
//
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void geQuantityUsers_FEMALE() {
//        int expected = User.getQuantitySexUsers(Sex.FEMALE);
//
//        int actual = 3;
//
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void getAllAgeUsers() {
//        int expected = User.getAllAgeUsers();
//
//        int actual = 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18;
//
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void getAllAgeUsers_MALE() {
//        int expected = User.getAllAgeUsers(Sex.MALE);
//
//        int actual = 10 + 11 + 12 + 13 + 14 + 15;
//
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void getAllAgeUsers_FEMALE() {
//        int expected = User.getAllAgeUsers(Sex.FEMALE);
//
//        int actual = 16 + 17 + 18;
//
//        Assert.assertEquals(expected, actual);
//    }
//}