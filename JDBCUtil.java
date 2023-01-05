package com.example.java_ana_chkhutiashvili;
import java.beans.Statement;
import java.sql.*;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCUtil {
    private static final  String DB_URL = "sql8.freesqldatabase.com";
    private static final String DB_USER = "sql8588494";
    private static final String DB_PASSWORD = "RkSR28I7Yv";

    private static Connection connection;
    private static Statement statement;


    private JDBCUtil(){
    }

    static {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static Statement getStatement(){
        if(statement == null){
            try{
                statement = (Statement) connection.createStatement();
            }catch (SQLException e){
                throw  new RuntimeException();
            }

        }
        return statement;
    }
}
