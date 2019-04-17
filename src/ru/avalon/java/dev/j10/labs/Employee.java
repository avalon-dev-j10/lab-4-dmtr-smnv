package ru.avalon.java.dev.j10.labs;

import java.util.Date;

public class Employee implements Person {

    private final String NAME;
    private final Date BIRTH_DATE;

    public Employee(String NAME, Date BIRTH_DATE) {
        this.NAME = NAME;
        this.BIRTH_DATE = BIRTH_DATE;
    }

    @Override
    public String getNAME() {
        return NAME;
    }

    @Override
    public Date getBIRTH_DATE() {
        return BIRTH_DATE;
    }

    @Override
    public int compareTo(Object o) {
        Employee empl = (Employee) o;
        if (this.NAME.compareTo(empl.NAME) > 0) {
            return 1;
        } else if ((this.NAME.compareTo(empl.NAME) == 0) && (this.BIRTH_DATE.compareTo(empl.BIRTH_DATE) > 0)) {
            return 1;
        } else if (this.NAME.compareTo(empl.NAME) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

}
