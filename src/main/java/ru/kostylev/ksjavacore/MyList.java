package ru.kostylev.ksjavacore;

import java.util.*;


public class MyList<T> implements List<Object> {
    private int size;
    private Item[] list;

    public MyList() {
        this.size = 0;
        this.list = new Item[1];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public boolean contains(Object o) {
        if (o != null) {
            for (Item tItem : list) {
                if (tItem.getItem().equals(o)) return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(Object item) {
        if (size == list.length){
            Item[] newArray = new Item[list.length+1];
            System.arraycopy(list, 0, newArray, 0, size);
            list = newArray;
        }
        Item newItem = new Item<>(item,size);
        list[size] = newItem;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (this.contains(o)){

        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<?> c) {
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
    public T get(int index) {
        T t = null;
        if (index >= 0 & index < list.length) {
            for (Item<T> item : list) {
                if (item.getCurrent() == index) {
                    t = item.getItem();
                }
            }
        }
        return t;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Object> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Object> listIterator(int index) {
        return null;
    }

    @Override
    public List<Object> subList(int fromIndex, int toIndex) {
        return null;
    }


    @Override
    public String toString() {
        return  "size=" + size +
                ", list=" + Arrays.toString(list);
    }
}
