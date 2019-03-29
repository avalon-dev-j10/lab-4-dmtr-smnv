package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class Sorter implements Sort {

    @Override
    public void sort(Object[] array) {
        if (array instanceof Comparable[]) {
            sort((Comparable[]) array);
        }
    }

    @Override
    public void sort(Comparable[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    Comparable temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[i], array[j]) < 0) {
                    Object temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
