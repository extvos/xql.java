package org.extvos.xql;

import org.extvos.xql.exception.Exception;


public class Transaction {
    private Session session;

    public Transaction(Session s) throws Exception {
        session = s;
    }

    public void Begin() throws Exception {

    }

    public void Commit() throws Exception {

    }

    public void Close() throws Exception {

    }
}
