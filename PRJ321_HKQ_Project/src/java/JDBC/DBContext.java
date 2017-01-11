/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author Tran Minh Quang
 */
public class DBContext {
//    private static final String IP = "localhost";
//    private static final String url = "jdbc:sqlserver://" + IP + ":1433;databaseName=Lab5_DB";
//    private static final String user = "sa";
//    private static final String passwd = "123456";

    private InitialContext ctx;

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

    public int insertPost(String title, String content, String author, Timestamp time, String state) throws Exception {
        openConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO Posts VALUES(?,?,?,?,?)");
        ps.setString(1, title);
        ps.setString(2, content);
        ps.setString(3, author);
        ps.setTimestamp(4, time);
        ps.setString(5, state);
        try {
            return ps.executeUpdate();
        } finally {
            ps.close();
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
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            //2. Get connection by url (connection string)
//            conn = DriverManager.getConnection(url, user, passwd);
            ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/PRJ321_Project");
            conn = ds.getConnection();
            System.out.println("connection: " + conn);
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        }
    }

    public int updatePost(String title, String content, String author, Timestamp time, String state, int id) throws Exception {
        openConnection();
        PreparedStatement ps = conn.prepareStatement("UPDATE Posts SET title = ?, content = ?, author = ?, published_time = ?, "
                + "state = ? WHERE post_id = ?");
        ps.setString(1, title);
        ps.setString(2, content);
        ps.setString(3, author);
        ps.setTimestamp(4, time);
        ps.setString(5, state);
        ps.setInt(6, id);
        try {
            return ps.executeUpdate();
        } finally {
            ps.close();
            close();
        }
    }
}
