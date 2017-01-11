/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Tran Minh Quang
 */
public class SessionCounter {
    public static AtomicInteger counter;
    static {
        counter = new AtomicInteger();
    }
}
