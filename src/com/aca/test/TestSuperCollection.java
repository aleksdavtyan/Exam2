package com.aca.test;

import com.aca.SuperCollection;

public class TestSuperCollection {
    public static SuperCollection<String> superCollection = new SuperCollection<>();

    public static void run(){
        testAdd();
        testContains();
        testDuplicateAdd();
        testGet();
        testIndexAdd();
        testRemove();
    }
    private static void testAdd() {
        superCollection = createDummyColl();
        Assert.equals(superCollection.size(), 3);
        System.out.println("Test add passed");
    }

    public static void testGet() {
        superCollection = createDummyColl();
        Assert.equals(superCollection.get(1), "b");
        System.out.println("Test get passed");
    }

    public static void testRemove() {
        superCollection = createDummyColl();
        Assert.equals(superCollection.remove("b"), true);
        Assert.equals(superCollection.size(), 2);
        System.out.println("Test remove passed");
    }

    public static void testContains() {
        superCollection = createDummyColl();
        Assert.equals(superCollection.remove("b"), true);
        System.out.println("Test contains passed");
    }

    public static void testDuplicateAdd() {
        superCollection = createDummyColl();
        superCollection.add("b");
        Assert.equals(superCollection.size(), 3);
        System.out.println("Test duplicate add passed");
    }


    private static void testIndexAdd() {
        superCollection = createDummyColl();
        Assert.equals(superCollection.get(2), "c");
        System.out.println("Test add at index passed");
    }

    private static SuperCollection createDummyColl() {
        superCollection = new SuperCollection<>();
        superCollection.add("a");
        superCollection.add("b");
        superCollection.add("c");
        return superCollection;
    }
}