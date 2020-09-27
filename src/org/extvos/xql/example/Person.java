package org.extvos.xql.example;

import org.extvos.xql.annotation.Table;
import org.extvos.xql.annotation.Column;
import org.extvos.xql.annotation.ForeignKey;

@Table(name = "persons")
public class Person {
    @Column(name = "id", primary = true)
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
        return firstName + " " + lastName + "(" + id + ")";
    }
}
