/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessObject;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import javax.servlet.http.Cookie;

/**
 *
 * @author Tran Minh Quang
 */
public class MySingleton {
    private static MySingleton instance = null;
    private TreeMap<String, Integer> mapID = null;
    private List<Cookie> cookies = null;
    
    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
    
    public List<Cookie> getCookies() {
        if (cookies == null) {
            cookies = new ArrayList<Cookie>();
        }
        return cookies;
    }
    
    public TreeMap<String, Integer> getMapID() {
        if (mapID == null) {
            mapID = new TreeMap<String, Integer>();
        }
        return mapID;
    }
    
    public void clearMapID() {
        if (mapID != null) {
            this.mapID = null;
        }   
        if (cookies != null) {
            cookies = null;
        }
    }
}
