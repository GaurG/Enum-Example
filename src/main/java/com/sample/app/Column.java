package com.sample.app;

/**
 * Int value enum
 *
 * @author Gaurav Gaur
 *
 **/
public enum Column {

    COLUMN1 (1),
    COLUMN2 (2),
    COLUMN3 (3);
    
    private final int columnName;
    
    Column(int columnName) {
        this.columnName = columnName;
    }
    
    public int getColumn() {
        return this.columnName;
    }

}