/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
            return st.executeUpdate(sql);

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
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/AdvJava_Workshop");
            conn = ds.getConnection();
            System.out.println("connection: " + conn);
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        }
    }

    public int insertProduct(int category_id, String name, String available, String description, float price) throws Exception {
        openConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO Pro_Details(Category_ID, Name, Available, Description, Price)"
                + " VALUES(?,?,?,?,?)");
        ps.setInt(1, category_id);
        ps.setString(2, name);
        ps.setString(3, available);
        ps.setString(4, description);
        ps.setFloat(5, price);
        try {
            return ps.executeUpdate();
        } finally {
            ps.close();
            close();
        }
    }

    public int updateProduct(int Product_ID, String category_id, String name, String available, String description, float price) throws Exception {
        openConnection();
        PreparedStatement ps = conn.prepareStatement("UPDATE Pro_Details SET Category_ID = ?, Name = ?, Available = ?, Description = ?, "
                + "Price = ? WHERE Product_ID = ?;");
        ps.setInt(1, Integer.parseInt(category_id));
        ps.setString(2, name);
        ps.setString(3, available);
        ps.setString(4, description);
        ps.setFloat(5, price);
        ps.setInt(6, Product_ID);
        try {
            return ps.executeUpdate();
        } finally {
            ps.close();
            close();
        }
    }
}
