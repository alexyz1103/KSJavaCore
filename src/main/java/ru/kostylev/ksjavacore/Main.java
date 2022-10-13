package ru.kostylev.ksjavacore;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //создание с путым конструктором
        MyList myList = new MyList<>();
        myList.add("Object 1");
        myList.add(10);
        myList.add("Object 3");
        myList.add("Object 4");

        //создание из другой коллекции
        MyList myList1 = new MyList(myList);

        System.out.println("Консольный вывод коллекции: " + myList);
        System.out.println("Метод size(): " + myList.size());
        System.out.println("Метод isEmpty: " + myList.isEmpty());
        System.out.println("Метод indexOf(): " + myList.indexOf("Object 1"));
        System.out.println("Метод lastIndexOf(): " + myList.lastIndexOf(10));
        System.out.println("Метод contains: " + myList.contains("Object 1"));
        System.out.println("Метод toArray():" + Arrays.toString(myList.toArray()));
        System.out.println("Метод get(index): " + myList.get(1));
        System.out.println("Метод set(index): было " + myList.set(1, "100") + " стало: " + myList.get(1));
        myList.add(3,"new element");
        System.out.println("Метод add(index, element): " + myList);
        myList.remove("Object 3");
        System.out.println("Метод remove(Object): " + myList);
        myList.remove(3);
        System.out.println("Метод remove(index): " + myList);

        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        System.out.println("Новый Arraylist другая коллекция: "+ arrayList);
        myList.addAll(arrayList);
        System.out.println("Метод addAll(collection): " + myList);
        myList.addAll(2,arrayList);
        System.out.println("Метод addAll(index, collection): " + myList);
        System.out.println("Метод containsAll(colllection): " + myList.containsAll(arrayList));

        List newList = myList.subList(2,3);
        System.out.println("Метод sublist(fromindex, toindex)" + newList);

        MyList.ListItr listIter = (MyList.ListItr) myList.listIterator();
        while(listIter.hasNext()){
            System.out.println("Работа итератора: " + listIter.next());
        }

        System.out.println(myList.getAuthor());
    }
}