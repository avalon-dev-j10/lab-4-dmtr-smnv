package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import java.util.Random;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        String[] strings = new String[20];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "Случайная строка " + new Random().nextInt(10);
        }

        Person[] persons = new Employee[20];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Employee(
                    "John Doe " + new Random().nextInt(10),
                    new Date(new Random().nextInt(Integer.MAX_VALUE)));
        }

        Sort sort = new Sorter();
        Comparator comparator = new Compare();

        sort.sort(persons);
        sort.sort(strings);
        sort.sort(strings, comparator);
    }
}
