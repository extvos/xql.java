package org.extvos.xql;

import org.extvos.xql.exception.DeclareException;
import org.extvos.xql.exception.Exception;

import java.lang.reflect.Field;

public class ForeignKey {
    protected Field field;
    protected String tableName, columnName;
    protected String onUpdate, onDelete;

    public ForeignKey() {

    }

    public ForeignKey(Field f) throws Exception {
        field = f;
        if (f.isAnnotationPresent(org.extvos.xql.annotation.ForeignKey.class)) {
            org.extvos.xql.annotation.ForeignKey cc = f.getAnnotation(org.extvos.xql.annotation.ForeignKey.class);
            tableName = cc.table();
            columnName = cc.column();
            onDelete = cc.onDelete();
            onUpdate = cc.onUpdate();
        } else {
            throw new DeclareException("Field should annotated by Column");
        }
    }
}
