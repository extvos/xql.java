package org.extvos.xql;

import org.extvos.xql.exception.Exception;

public class Session {
    private Engine engine;

    public Session(Engine e) throws Exception {
        engine = e;
    }

    public Transaction Begin() throws Exception {
        Transaction t = new Transaction(this);
        t.Begin();
        return t;
    }

    public QuerySet Table(Table table, Join... joints) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }

    public QuerySet Select(Table table, String... fields) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }

    public QuerySet Update(Table table) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }

    public QuerySet Delete(Table table) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }

    public QuerySet Insert(Table table, Object... objs) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }

    public QuerySet Query(String fmt, Object... args) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }

    public QuerySet Exec(String fmt, Object... args) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }


}
