package org.extvos.xql;

import org.extvos.xql.exception.Exception;


public class Transaction {
    private Session session;

    public Transaction(Session s) throws Exception {
        session = s;
    }

    public void begin() throws Exception {

    }

    public void commit() throws Exception {

    }

    public void close() throws Exception {

    }
}
