package com.sample.app;

/**
 * String value enum
 *
 * @author Gaurav Gaur
 *
 **/
public enum Table {
    TABLE1 ("Table Name One"),
    TABLE2 ("Table Name Two"),
    TABLE3 ("Table Name Three");
    
    private final String tableName;
    
    Table(String tableName) {
        this.tableName = tableName;
    }
    
    public String getTableName() {
        return this.tableName;
    }
}