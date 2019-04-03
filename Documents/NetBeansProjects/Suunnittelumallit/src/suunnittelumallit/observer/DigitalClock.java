/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.observer;

import java.awt.TextField;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tanel
 */
public class DigitalClock implements Observer{
    
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Timer){
            Timer timer = (Timer)o;
            System.out.println(timer.getSecond() + ":"
            + timer.getMinute()+ ":"
            + timer.getHour());
        }
    }
    
}
