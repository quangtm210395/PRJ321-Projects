/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author Tran Minh Quang
 */
public class MyContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context Initialized!!!");
        ServletContext sc = sce.getServletContext();
        System.out.println("Init param: " + sc.getInitParameter("configParam"));
        
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context Destroyed!!!");
    }
}
