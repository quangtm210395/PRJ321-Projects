/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussinessObject;

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
    
    public static boolean isSuccessful(String user, String pass) {
        if (checkUser(user) && checkPass(pass)) {
            if (UsersSingleton.getInstance().getMap().containsKey(user)) {
                if (UsersSingleton.getInstance().getMap().get(user).equals(pass)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean isRegis(String user, String pass, String re_pass) {
        if (checkUser(user) && checkPass(pass) && pass.equals(re_pass)) {
            if (!UsersSingleton.getInstance().getMap().containsKey(user)) {
                return true;
            }
        }
        return false;
    }
}
