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

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);

        sort.sort(strings);

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
    }
}
