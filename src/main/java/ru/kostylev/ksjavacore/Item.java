package ru.kostylev.ksjavacore;

public class Item<T> {
  private T item;

  private int previous;
  private int current;
  private int next;

    public Item() {
        this.current = 0;
        this.item = null;
    }

    public Item(T item, int current) {
        this.item = item;
        this.current = current;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public int getPrevious() {
        return previous;
    }

    public void setPrevious(int previous) {
        this.previous = previous;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
