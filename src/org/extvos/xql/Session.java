package org.extvos.xql;

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

    public QuerySet Select(Table table, String... fields) throws Exception {
        QuerySet qs = new QuerySet();
        return qs;
    }
}
