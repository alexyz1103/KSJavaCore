package ru.kostylev.ksjavacore;


public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList<>();
        myList.add("Object 1");
        myList.add(10);
        myList.add("Object 3");


        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        System.out.println(myList.get(0));
        System.out.println(myList.contains("string object"));

    }
}