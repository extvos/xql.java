package org.extvos.xql.example;
import org.extvos.xql.annotation.Table;
public class Starter {
    public static void main(String[] args) {
        Person person = new Person();
        person.id = 1;
        person.firstName = "Mingcai";
        person.lastName = "SHEN";
        if(Person.class.isAnnotationPresent(Table.class)){
            Table t = person.getClass().getAnnotation(Table.class);
            System.out.println(t.tableName());
        }
        System.out.println("Hello," + person);
    }
}
