package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class Compare implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int compare(Person empl1, Person empl2) {
        String name1 = empl1.getName();
        String name2 = empl2.getName();
        return name1.compareTo(name2);
    }

}
