/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Tran Minh Quang
 */
public class DBContext {

    static final String IP = "127.0.0.1";
    static final String url = "jdbc:sqlserver://" + IP + ":1433;databaseName=PRJ1008_DB";
    static final String user = "sa";
    static final String passwd = "123456";

    private Connection conn = null;
    private Statement st = null;

    public int executeUpdate(String sql) throws Exception {
        openConnection();
        try {
            return st.executeUpdate(sql);
        } finally {
            close();
        }
    }

    public ResultSet executeQuery(String sql) throws Exception {
        openConnection();
        return st.executeQuery(sql);

    }

    public void close() {
        if (st != null) {
            try {
                st.close();
            } catch (Exception ignore) {
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception ignore) {
            }
        }
    }

    private void openConnection() throws Exception {
        if (conn == null) {
            ///
            //1. Load class
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //2. Get connection by url (connection string)
            conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("connection: " + conn);
            st = conn.createStatement();
        }
    }
}
