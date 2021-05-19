package org.extvos.xql;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Table {
    Class entity;
    String tableName, engine, charset, desc;
    Field[] fields;
    List<Column> columns;
    Map<String, Column> columnMap;
    Map<String, Field> fieldMap;
    List<Column> primaryKeys;
    List<ForeignKey> foreignKeys;
    List<Constraint> constraints;
    List<Index> indexes;

    // Basic Functions
    public Table(Class e) throws Exception {
        this.entity = e;
        org.extvos.xql.annotation.Table t;
        if (!(e.isAnnotationPresent(org.extvos.xql.annotation.Table.class))) {
            throw new Exception("entity should be annotated by @Entity");
        } else {
            t = (org.extvos.xql.annotation.Table) e.getAnnotation(org.extvos.xql.annotation.Table.class);
            tableName = t.name();
            engine = t.engine();
            charset = t.charset();
            desc = t.desc();
        }
        fields = entity.getDeclaredFields();
        for (Field field : fields) {
            Column c = new Column(field);
            columns.add(c);
            columnMap.put(c.name, c);
            fieldMap.put(c.name, field);
            if (c.primary) {
                primaryKeys.add(c);
            }
            if (c.foreignKey != null) {
                foreignKeys.add(c.foreignKey);
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

    public static Table declare(Class entity) throws Exception {
        return new Table(entity);
    }

    public String getTableName() {
        return tableName;
    }

    public Column[] getColumns() {
        return (Column[]) columns.toArray();
    }

    public Field[] getFields() {
        return fields;
    }

    public Column[] getPrimaryKeys() {
        return (Column[]) primaryKeys.toArray();
    }

    public ForeignKey[] getForeignKeys() {
        return (ForeignKey[]) foreignKeys.toArray();
    }

    public String createSQL() {
        return "";
    }

    public String dropSQL() {
        return "";
    }
}
