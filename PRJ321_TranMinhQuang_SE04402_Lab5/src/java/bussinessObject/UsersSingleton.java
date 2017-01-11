/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussinessObject;

import java.util.HashMap;

/**
 *
 * @author Tran Minh Quang
 */
public class UsersSingleton {
    private static UsersSingleton instance = null;
    private  HashMap<String, String> mapData = null;

    public UsersSingleton() {
    }
    
    public void regis(String user, String pass) {
        mapData.put(user, pass);
    }
    
    public HashMap<String, String> getMap() {
        if (mapData == null) {
            mapData = new HashMap<String, String>();
            mapData.put("adminlogin", "Admin@123");
        }
        return mapData;
    }
    public static UsersSingleton getInstance(){
        if (instance == null) {
            instance = new UsersSingleton();
        }
        return instance;
    }
    
    
}
