package org.extvos.xql.example;

import org.extvos.xql.annotation.Table;
import org.extvos.xql.annotation.Column;
import org.extvos.xql.annotation.ForeignKey;

@Table(name = "persons", engine = "INNODB", charset = "gb2312", desc = "Person table")
public class Person {
    @Column(name = "id", primary = true, autoIncrement = true)
    public int id;
    @Column(name = "firstname", nullable = false)
    public String firstName;
    @Column(name = "lastname", nullable = false)
    public String lastName;
    @ForeignKey(table = "", column = "")
    public String school;

    public Person(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    public String toString() {
        return "(" + id + ") " + firstName + " " + lastName;
    }
}
