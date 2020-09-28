package org.extvos.xql;

import java.util.Arrays;
import java.util.List;

public class QuerySet {
    protected Table table;
    protected List<Join> joints;
    protected List<String> selectFields, groups, orders;
    protected String query;
    protected String action;
    protected long offset, limit;

    public QuerySet() {
        offset = limit = 0;
        query = action = "";
    }

    public QuerySet select(String... fields) throws Exception {
        selectFields.addAll(Arrays.asList(fields));
        return this;
    }

    public QuerySet where() throws Exception {
        return this;
    }

    public QuerySet join(Table t, String on) throws Exception {
        joints.add(new Join(t).on(on));
        return this;
    }

    public QuerySet rightJoin(Table t, String on) throws Exception {
        joints.add(Join.Right(t).on(on));
        return this;
    }

    public QuerySet leftJoin(Table t, String on) throws Exception {
        joints.add(Join.Left(t).on(on));
        return this;
    }

    public QuerySet groupBy(String... cls) throws Exception {
        groups.addAll(Arrays.asList(cls));
        return this;
    }

    public QuerySet orderBy(String... cls) throws Exception {
        orders.addAll(Arrays.asList(cls));
        return this;
    }

    public QuerySet offset(long off) throws Exception {
        offset = off;
        return this;
    }

    public QuerySet limit(long lmt) throws Exception {
        limit = lmt;
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
