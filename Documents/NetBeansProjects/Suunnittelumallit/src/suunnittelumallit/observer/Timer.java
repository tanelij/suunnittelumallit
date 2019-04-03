/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.observer;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tanel
 */
public class Timer extends Observable implements Runnable{
    private int second = 0;
    private int minute = 0;
    private int hour = 0;
    private boolean stop = false;

    /**
     * @return the second
     */
    public int getSecond() {
        return second;
    }

    /**
     * @return the minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * @return the hour
     */
    public int getHour() {
        return hour;
    }
    
    public void tick(){
        second++;
        
        if(second >= 60){
            minute++;
            second = 0;
        }
        
        if(minute >= 60){
            hour = (hour + 1) % 24;
            minute = 0;
        }
        setChanged();
    }

    @Override
    public void run() {
        while(!stop){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
            tick();
        }
    }
    
    public void stop(){
        this.stop = true;
    }
}
