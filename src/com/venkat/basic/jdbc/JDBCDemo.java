package com.venkat.basic.jdbc;

import java.sql.*;

public class JDBCDemo
{
    //get the rows from students table
    //select * from venkat.students;




    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
         String jdbc_driver = "com.mysql.cj.jdbc.Driver";
         String jdbc_url = "jdbc:mysql://localhost:3306?serverTimezone=UTC";

         String username = "root";
         String password = "Ravi27india";

        Connection connection = null;
        Statement statement = null;

        Class.forName(jdbc_driver);//register/intialize driver

        //get connection object
        connection = DriverManager.getConnection(jdbc_url,username,password);

        //write update logic

        JDBCDemo demo = new JDBCDemo();
        //demo.updateTable(statement,connection);
        demo.DisplayTableRecords(statement,connection);



    }
        //sdkman
    public void DisplayTableRecords(Statement statement,Connection connection) throws SQLException
    {
        String sql = "select * from teja.Students";

        //executing query
        statement = connection.createStatement();

        ResultSet rs = statement.executeQuery(sql);

        //store in result set and extract from result set
        while(rs.next())
        {
            String name = rs.getString("Name");
            int id = rs.getInt("id");
            String dept = rs.getString("dept");
            String degree = rs.getString("degree");

            System.out.println("Name: "+name);
            System.out.println("ID: "+id);
            System.out.println("Department: "+dept);
            System.out.println("Degree: "+degree);

        }
        rs.close();
        statement.close();
        connection.close();
    }
}
