package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class Compare implements Comparator<String> {

    public int compare(String string1, String string2) {
        return string1.compareTo(string2);
    }

}
