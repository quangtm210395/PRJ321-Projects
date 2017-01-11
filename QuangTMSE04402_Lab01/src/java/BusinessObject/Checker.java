/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessObject;

/**
 *
 * @author Tran Minh Quang
 */
public class Checker {
    public static boolean check_Product(String name, String available, String description, String price) {
        if (name == null || available == null | description == null|| price == null) {
            return false;
        }
        if (name.isEmpty() || name.length() > 50 || description.isEmpty() || description.length() > 150) {
            return false;
        }
        try {
            float pri = Float.parseFloat(price);
            if (pri < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
