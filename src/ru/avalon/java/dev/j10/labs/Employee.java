package ru.avalon.java.dev.j10.labs;

import java.util.Date;

public class Employee implements Person {

    private final String name;
    private final Date birthDate;

    public Employee(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Object other) {
        return 1;
    }

}
