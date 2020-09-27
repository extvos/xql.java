package org.extvos.xql;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class Table {
    Class entity;
    Field[] fields;
    List<Column> columns;
    Map<String, Column> columnMap;
    Map<String, Field> fieldMap;
    List<Column> primaryKeys;
    List<Column> foreignKeys;
    List<Constraint> constraints;
    List<Index> indexes;

    // Basic Functions
    public Table(Class entity) throws Exception {
        this.entity = entity;
        if (!(entity.isAnnotationPresent(org.extvos.xql.annotation.Table.class))) {
            throw new Exception("entity should be annotated by @Entity");
        }
        fields = entity.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Column c = new Column(fields[i]);
            columns.add(c);
            columnMap.put(c.name, c);
            fieldMap.put(c.name, fields[i]);
            if (c.primary) {
                primaryKeys.add(c);
            }
            if (c.foreignKey != null) {
                foreignKeys.add(c);
            }
        }
        if (entity.isAnnotationPresent(org.extvos.xql.annotation.Unique.class)) {

        }
        if (entity.isAnnotationPresent(org.extvos.xql.annotation.Check.class)) {

        }
        if (entity.isAnnotationPresent(org.extvos.xql.annotation.PrimaryKey.class)) {

        }
        if (entity.isAnnotationPresent(org.extvos.xql.annotation.Index.class)) {

        }
    }

    public String CreateSQL() {
        return "";
    }

    public String DropSQL() {
        return "";
    }
}
