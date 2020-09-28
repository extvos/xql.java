package org.extvos.xql;

import org.extvos.xql.exception.Exception;

public class Session {
    private Engine engine;

    public Session(Engine e) throws Exception {
        engine = e;
    }

    public Transaction Begin() throws Exception {
        Transaction t = new Transaction(this);
        t.begin();
        return t;
    }

    public QuerySet table(Table table, Join... joints) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }

    public QuerySet select(Table table, String... fields) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }

    public QuerySet update(Table table) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }

    public QuerySet delete(Table table) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }

    public QuerySet insert(Table table, Object... objs) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }

    public QuerySet query(String fmt, Object... args) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }

    public QuerySet exec(String fmt, Object... args) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }


}
