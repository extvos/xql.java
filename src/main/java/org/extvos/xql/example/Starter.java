package org.extvos.xql.example;

import org.extvos.xql.annotation.Column;
import org.extvos.xql.annotation.Table;

public class Starter {
    public static void main(String[] args) {
        Person person = new Person("Mingcai", "SHEN");
        person.id = 1;
//        person.firstName = "Mingcai";
//        person.lastName = "SHEN";
        if (Person.class.isAnnotationPresent(Table.class)) {
            Table t = person.getClass().getAnnotation(Table.class);
            System.out.println(t.name());
        }
        java.lang.reflect.Field[] fields;
        fields = Person.class.getFields();
        for (int i = 0; i < fields.length; i++) {
            java.lang.reflect.Field f = fields[i];
            if (f.isAnnotationPresent(Column.class)) {
                Column c = f.getAnnotation(Column.class);
                System.out.printf("Column: %s \n", c.name());
            }

        }
        System.out.println("Hello," + person);
    }
}
