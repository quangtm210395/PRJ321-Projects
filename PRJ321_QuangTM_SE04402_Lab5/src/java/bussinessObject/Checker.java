/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussinessObject;

import JDBC.DBContext;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Minh Quang
 */
public class Checker {
    
    public static boolean userContains(String username){
        return UsersSingleton.getInstance().getMap().containsKey(username);
    }
    
    public  static boolean checkUser(String user) {
        if (user == null || user.length() <= 6) {
            return false;
        }
        for (int i = 0; i < user.length(); i++) {
            if (!Character.isLetter(user.charAt(i)) && !Character.isDigit(user.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkPass(String pass) {
        if (pass == null && pass.length() <= 8) {
            return false;
        }
        int u = 0, n = 0, s = 0;
        String SPECIAL_CHAR = "$#@%^&*";
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
                u++;
            }
            if (Character.isDigit(pass.charAt(i))) {
                n++;
            }
            if (SPECIAL_CHAR.contains(pass.charAt(i) + "")) {
                s ++;
            }
        }
        
        return u>0 && n>0 && s>0;
    }
    
    public static boolean isLoginSuccessful(String user, String pass) {
        if (checkUser(user) && checkPass(pass)) {
            DBContext db = new DBContext();
            String sql = "SELECT * from Users where username = '" + user + "'";
            try {
                ResultSet rs = db.executeQuery(sql);
                rs.next();
                if (pass.equals(rs.getString(2))) {
                    return true;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                return false;
            } finally{
                db.close();
            }
        }
        return false;
    }
    
    public static boolean isRegisSuccessful(String user, String pass, String re_pass) throws Exception {
        if (checkUser(user) && checkPass(pass) && pass.equals(re_pass)) {
            DBContext db = new DBContext();
            String sql = "INSERT INTO Users values('" + user + "', '" + pass + "')";
            db.executeUpdate(sql);
            return true;
        }
        return false;
    }
}
