package org.extvos.xql;

import java.util.List;

public class QuerySet {
    protected Table table;
    protected List<Join> joints;
    protected String query;
    protected String action;

    public QuerySet Where() throws Exception {
        return this;
    }

    public QuerySet Join(Table t) throws Exception {
        return this;
    }

    public QuerySet RightJoin(Table t) throws Exception {
        return this;
    }

    public QuerySet LeftJoin(Table t) throws Exception {
        return this;
    }

    public QuerySet GroupBy(Column... cls) throws Exception {
        return this;
    }

    public QuerySet OrderBy() throws Exception {
        return this;
    }

    public QuerySet Offset(long off) throws Exception {
        return this;
    }

    public QuerySet Limit(long lmt) throws Exception {
        return this;
    }

    public Row first() throws Exception {
        return new Row();
    }

    public Rows all() throws Exception {
        return new Rows();
    }

    public void run() throws Exception {

    }
}
