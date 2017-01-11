/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luyenchu
 */
public class JdbcDemo {
    //change to 127.0.0.1 (localhost, loop back interface)
    static final String IP = "192.168.56.101";
    static final String url = "jdbc:sqlserver://"+IP+":1433;databaseName=PRJ1008_DB";
    static final String user = "sa";
    static final String passwd = "123456";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. Load class
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //2. Get connection by url (connection string)
        Connection connection = DriverManager.getConnection(url, user, passwd);
        System.out.println("connection: " + connection);
        //3. Create statement
        Statement st = connection.createStatement();
        //4.1 DML: SELECT
        String sql = "SELECT * FROM Persons";
        ResultSet rs = st.executeQuery(sql);
        //move to the next record
        while(rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            System.out.println("ID: " + id+", Name: " + name);
        }
        //4.2 INSERT/UPDATE/DELETE
        String insert = "INSERT INTO Persons(personName, personAge)"
                + " VALUES (N'Xuan Bang','20')";
        int in = st.executeUpdate(insert);
        System.out.println("IN: " + in);
        
        rs.close();
        st.close();
        connection.close();
    }
}
