package org.extvos.xql;

public class Join {
    protected Table table;
    protected int direction; // -1,0,1
    protected String onClause;

    public Join(Table t) {
        table = t;
        direction = 0;
    }

    public static Join Right(Table t) {
        Join j = new Join(t);
        j.direction = 1;
        return j;
    }

    public static Join Left(Table t) {
        Join j = new Join(t);
        j.direction = -1;
        return j;
    }

    public Join on(String clause) {
        onClause = clause;
        return this;
    }
}