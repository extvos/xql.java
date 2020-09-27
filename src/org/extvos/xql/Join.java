package org.extvos.xql;

public class Join {
    protected Table table;
    protected int direction; // -1,0,1
    protected String onClause;

    public Join(Table t) {
        table = t;
    }

    public Join On(String clause) {
        onClause = clause;
        return this;
    }
}