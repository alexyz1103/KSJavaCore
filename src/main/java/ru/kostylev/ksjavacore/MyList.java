package ru.kostylev.ksjavacore;

import java.util.*;


public class MyList<T> implements List<T> {
    private int size; // поле содержащее размер коллекции
    private Object[] list; // поле содержащие коллекцию ввиде масива

    //Конструктор без параметров, создает массив на 10 пустых элементов
    //и задает размер коллекции 0
    public MyList() {
        this.size = 0;
        this.list = new Object[10];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    //метод возвращающий индекс первого вхождения элемента в коллекцию
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(o)) return i;
        }
        return -1;
    }
    //метод возвращающий индекс последнего вхождения элемента в коллекцию
    @Override
    public int lastIndexOf(Object o) {
        for (int i = size-1; i >= 0; i--) {
            if (list[i].equals(o)) return i;
        }
        return -1;
    }

    //метод для опеределения что объект входит в состав коллекции
    //реализован с помощью indexOf, если у объекта нет индекса, те -1
    //вернет false
    @Override
    public boolean contains(Object o) {
        return this.indexOf(o)!=-1;
    }
    //Возвращает массив коллекции равный размеру коллекции
    @Override
    public Object[] toArray() {
        Object[] arr = new Object[size()];
        for (int i = 0; i < size; i++) {
            arr[i] = list[i];
        }
        return arr;
    }
    //????????????????????????????
    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }
    //вспомогательный метод проверяющий вхождение индекса в размер коллекции
    public boolean checkIndex(int index){
        return index >= 0 & index <= size;
    }

    //метод который возвращает элемент коллекции если индекс входит в размер коллекции
    @Override
    public T get(int index) {
        return (checkIndex(index)? (T) list[index]: null);
    }

    //метод заменяет старое значение коллекции в указаном индексе на новое,
    // если индекс выходит за пределы коллекции возвращает null
    @Override
    public T set(int index, T element) {
        if (checkIndex(index)){
            T old = (T) list[index];
            list[index] = element;
            return old;
        }
        return null;
    }

    //Вспомогательный метод который возвращает срез массива коллекции,
    //если стартовый и конечный индексы входят в размерность коллекции
    public Object[] slice(int startIndex, int endIndex){
        Object[] arr = new Object[endIndex-startIndex+1];
        for (int i = 0; i < endIndex-startIndex+1; i++) {
            arr[i] = list[startIndex+i];
        }
        return arr;
    }
    //вспомогательный метод расширяющий массив вдвое
    public void grow(Object[] arr){
            Object[] newArr = new Object[list.length*2];
            for (int i = 0; i < size; i++) {
                newArr[i] = list[i];
            }
            list = newArr;
    }
    //вспомогательный метод проверяет надо ли расширять массив
    public boolean checkGrow(Object[] arr){
        return arr.length == size;
    }

    //метод вставляет элемент в коллекцию в указанной позиции индекса,
    // если индекс входит в диапазон, со смещением остальных элементов
    // в право
    @Override
    public void add(int index, Object element) {
        if (checkIndex(index)){
            if (checkGrow(list)) {grow(list);}
            Object[] arr = slice(index,size-1);
            list[index] = element;
            for (int i = 0; i < arr.length; i++) {
                list[index+i+1] = arr[i];
            }
            size++;
        }
    }

    //Метод для добавления элемента коллекции в конец
    @Override
    public boolean add(Object o) {
        if (checkGrow(list)) {grow(list);}
        add(size,o);
//        if (size == list.length){ //проверяем если размер коллекции уже равен размеру массива
//            Object[] newArray = new Object[list.length*2]; // создаем новый массив с размером в два раза больше
//            for (int i = 0; i < list.length; i++) { newArray[i] = list[i]; } // копируем из массива коллекции в новый расширеный
//            this.list = newArray;//
//        }
//        list[size] = o;
//        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (this.contains(o)){
            for (int i = 0; i < size; i++) {
                if (list[i].equals(o)){
                    Object[] arr = new Object[size-i-1];
                    for (int j = 0; j < size-i-1 ; j++) {
                        arr[j] = list[i+j+1];
                    }
                    for (int j = 0; j < size-i-1; j++) {
                        list[i+j] = arr[j];
                    }
                    list[size-1] = null;
                    size--;
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public Iterator<T> iterator() {
        //Iterator newArray = new Iterable<>();
        return null;
    }






    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }







    @Override
    public T remove(int index) {
        return null;
    }



    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }


    @Override
    public String toString() {
        return  "size=" + size +
                ", list=" + Arrays.toString(list);
    }
}
