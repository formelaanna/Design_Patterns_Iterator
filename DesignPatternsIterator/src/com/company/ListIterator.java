package com.company;

import java.util.List;

public class ListIterator<E> implements Iterator {
    int position =0;
    List<E> items;

    public ListIterator(List<E> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.size() || items.get(position)==null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        E item = items.get(position);
        position++;
        return item;
    }
}
