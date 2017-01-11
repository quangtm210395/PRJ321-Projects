/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t;

/**
 *
 * @author Tran Minh Quang
 */

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
public class MD5 {
 
    public static String encryptMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
 
    public static void main(String[] args) throws Exception {
        System.out.println("http://android.vn/ - hướng dẫn: thanhlong90.it");
        System.out.println("----------- Mã hóa 1 chiều với MD5 -----------");
        System.out.println("");
        System.out.println("Dữ liệu mã hóa: thanhlong90.it");
        System.out.println("Kết quả đã mã hóa: " + encryptMD5("thanhlong90.it"));
    }
 
}