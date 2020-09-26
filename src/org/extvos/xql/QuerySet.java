package org.extvos.xql;

public class QuerySet {

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
}
