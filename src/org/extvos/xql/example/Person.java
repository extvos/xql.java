package org.extvos.xql.example;

import org.extvos.xql.annotation.Column;
import org.extvos.xql.annotation.ForeignKey;
import org.extvos.xql.annotation.Table;

@Table(tableName = "persons")
public class Person {
    @Column(name="id",primary = true)
    public int id;
    @Column(name="firstname",nullable = false)
    public String firstName;
    @Column(name="lastname",nullable = false)
    public String lastName;
    @ForeignKey(table = "", column = "")
    public String school;
}
