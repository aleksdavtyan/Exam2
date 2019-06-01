package com.aca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SuperCollection<E> implements Iterable<E> {

    List<E> list = new ArrayList<>();

    public void add(E item) {
        if (!list.contains(item) && !item.equals(null)) {
            list.add(item);
        }
    }

    public void add(int index, E item) {
        if (!list.contains(item) && !item.equals(null)) {
            list.add(index, item);
        }
    }

    public E get(int index) {
        return list.get(index);
    }

    public boolean contains(E item) {
        if (list.contains(item))
            return true;
        else return false;
    }

    public void remove(int index) {
        list.remove(index);
    }

    public void remove(E value) {
        list.remove(value);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}
