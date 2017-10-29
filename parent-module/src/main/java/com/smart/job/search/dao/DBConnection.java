package com.smart.job.search.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {


    public static Connection getConnection() throws SQLException {
        Connection connection= DriverManager.getConnection("","","");


        return connection;
    }

}
