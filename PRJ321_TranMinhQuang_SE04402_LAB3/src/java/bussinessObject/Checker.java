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
    public static boolean checkFullName(String name) {
        if (name.isEmpty()) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
//    
    
    public static boolean checkAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            if (age <= 18 || age >= 40) {
                throw new Exception();
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
