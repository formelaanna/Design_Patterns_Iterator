package com.company;

public class ArrayIterator <E> implements Iterator {
    int position=0;
    E[] items;

    public ArrayIterator( E[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.length || items[position]==null){
        return false;
        }
        return true;
    }

    @Override
    public E next() {
        E item = items[position];
        position++;
        return item;
    }
}
