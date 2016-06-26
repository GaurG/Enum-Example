package com.sample.app;

/**
 * Main class to call various implementations of Enum
 *
 * @author Gaurav Gaur
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "\nDay example" );
        System.out.println( Day.SUNDAY );
        
        System.out.println( "\nColumn Example" );
        Column col = Column.COLUMN2;
        int colValue = col.getColumn();
        System.out.println( colValue );
        
        System.out.println( "\nTable Example" );
        Table table = Table.TABLE2;
        String tableName = table.getTableName();
        System.out.println( tableName );
    }
}
