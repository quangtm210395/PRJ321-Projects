/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import java.util.Date;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author Tran Minh Quang
 */
public class MySessionListener implements ServletContextListener, HttpSessionListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context Initialized!!!");
        ServletContext sc = sce.getServletContext();
        System.out.println("Init param: " + sc.getInitParameter("configParam"));
        
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context Destroyed!!!");
    }

    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("***************************************");
        System.out.println("New Session created: " + new Date());
        int get = SessionCounter.counter.getAndIncrement();
        System.out.println("Session counter: " + get);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        
    }
}
