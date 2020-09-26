package org.extvos.xql;

import java.lang.reflect.Field;

public class Table<T> {
    // Basic Functions
    public Table(T entity) throws Exception {
        if (!(entity instanceof Entity)) {
            throw new Exception("entity should be an instance of Entity");
        }
        Field[] fields = entity.getClass().getDeclaredFields();
    }

    public String CreateSQL() {
        return "";
    }

    public String DropSQL() {
        return "";
    }
}
