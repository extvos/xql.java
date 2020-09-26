package org.extvos.xql;

public class Order {
    public static final int ASC = 1;
    public static final int DESC = -1;
    private Column column;
    private int order;

    public Order(Column c) {
        column = c;
        order = ASC;
    }

    public Order(Column c, int o) {
        column = c;
        if (o == DESC) {
            order = DESC;
        } else {
            order = ASC;
        }
    }

    public Order Asc() {
        order = ASC;
        return this;
    }

    public Order Desc() {
        order = DESC;
        return this;
    }

}
