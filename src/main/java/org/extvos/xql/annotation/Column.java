package org.extvos.xql.annotation;

import org.extvos.xql.Type;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shenmc
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {
    /** Column name, empty string means get field name as column name. */
    String name() default "";
    /** Column Type */
    Type type() default Type.NONE;
     /**  If column indexed */
    boolean index() default false;
     /** If column nullable */
    boolean nullable() default false;
    /** If column is primary key */
    boolean primary() default false;
    /** Autoincrement */
    boolean autoIncrement() default false;
    /** Column size, for CHAR,VARCHAR, etc... */
    int size() default 4;
    /** Column default value presents for SQL, empty string means no default value. */
    String defVal() default "";
    /** Column check constraint */
    String check() default "";
    /** Column unique constraint */
    boolean unique() default false;
    /** Column description */
    String comment() default "";
}
