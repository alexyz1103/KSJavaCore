package ru.kostylev.ksjavacore;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList<>();
        myList.add("Object 1");
        myList.add(10);
        myList.add("Object 3");
        myList.add("Object 4");


        System.out.println("Консольный вывод коллекции: " + myList);
        System.out.println("Метод size(): " + myList.size());
        System.out.println("Метод isEmpty: " + myList.isEmpty());
        System.out.println("Метод indexOf(): " + myList.indexOf("Object 1"));
        System.out.println("Метод lastIndexOf(): " + myList.lastIndexOf(10));
        System.out.println("Метод contains: " + myList.contains("Object 1"));
        System.out.println("Метод toArray():" + Arrays.toString(myList.toArray()));
        System.out.println("Метод get(index): " + myList.get(1));
        System.out.println("Метод set(index): было " + myList.set(1, "100") + " стало: " + myList.get(1));
        myList.add(6,"new element");
        System.out.println("Метод add(index, element): " + myList);
        //myList.remove("Object 1");
        //System.out.println(myList);

    }
}