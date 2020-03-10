package com.company;

import java.util.ArrayList;

public class Main {

    private static Integer[] array = new Integer[8];
    private static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        array[0]=5;
        array[1]=15;
        array[2]=67;
        array[3]=34;
        array[4]=89;
        array[5]=56;
        array[6]=81;
        array[7]=99;

        list.add(4);
        list.add(76);
        list.add(34);
        list.add(21);
        list.add(15);
        list.add(55);
        list.add(66);
        list.add(45);

        showData(new ArrayIterator(array), "Array");
        showData(new ListIterator(list), "List");

    }

    private static void showData(Iterator iterator, String information){
        if(iterator!=null){
            System.out.println("Data: " + information);
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
            System.out.println("");
        }
    }
}
