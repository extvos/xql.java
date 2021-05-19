package org.extvos.xql;


import java.lang.reflect.Field;

import org.extvos.xql.exception.Exception;
import org.extvos.xql.exception.DeclareException;

public class Column {

    protected Field field;
    protected String name, check, desc, defVal, type;
    protected boolean unique, primary, index, nullable;
    protected int size;
    protected ForeignKey foreignKey;

    public Column(Field f) throws Exception {
        field = f;
        if (f.isAnnotationPresent(org.extvos.xql.annotation.Column.class)) {
            org.extvos.xql.annotation.Column cc = f.getAnnotation(org.extvos.xql.annotation.Column.class);
            name = cc.name();
            check = cc.check();
            desc = cc.comment();
            defVal = cc.defVal();
            unique = cc.unique();
            primary = cc.primary();
            index = cc.index();
            nullable = cc.nullable();
            size = cc.size();
        } else {
            throw new DeclareException("Field should annotated by Column");
        }
        if (f.isAnnotationPresent(org.extvos.xql.annotation.ForeignKey.class)) {
            foreignKey = new ForeignKey(field);
        }
        recheck();
    }

    public Column(String n, String t) throws Exception {
        name = n;
        type = t;
        recheck();

    }

    public Column(String n, String t, String v) throws Exception {
        name = n;
        type = t;
        defVal = v;
        recheck();
    }

    public Column(String n, String t, String v, Boolean u) throws Exception {
        name = n;
        type = t;
        defVal = v;
        nullable = u;
        recheck();
    }

    public void recheck() throws Exception {
        if (name.equals("")) {
            throw new DeclareException("invalid name");
        }
        if (type.equals("")) {
            throw new DeclareException("invalid type");
        }
        if (primary) {
            index = true;
            unique = true;
            nullable = false;
        }
    }
}
