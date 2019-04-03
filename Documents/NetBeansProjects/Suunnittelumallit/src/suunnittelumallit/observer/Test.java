/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.observer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Testissä luodaan ajastimelle ja kellolle omat säikeensä.
 * Ajastinsäiettä ajetaan minuutin ajan kunnes se ja ajastin pysäytetään.
 * 
 *
 */
public class Test {
    public static void main(String[] args){
        clockTest(5, 20, 0, 0);
    }
       
    /**
    *Testissä luodaan digitaalikellon ja ajastimen esiintymät ja kytketään
    * ne toisiinsa. Joka kerta, kun testi tarkistaa onko tila muuttunut
    * se tulostaa kuinka paljon aikaa on kulunut testin alusta, jotta
    * voi seurata kuinka tarkka ajastin on.
    *
    * @param  pollingRate  Kuinka monta kertaa sekunnissa testataan 
    *                       onko kello päivittynyt.
     * @param secs  Kuinka monta sekuntia kelloa testataan.
     * @param mins  Kuinka monta minuuttia kelloa testataan.
     * @param hours Kuinka monta tuntia kelloa testataan.
    * 
    */
    public static void clockTest(double pollingRate, int secs, int mins, int hours){
        DigitalClock digitalClock = new DigitalClock();
        Timer timer = new Timer();       
        timer.addObserver(digitalClock);
        
        
        new Thread(timer).start();
        new Thread(() -> {
            double deltaTime = 0;
            double startTime = System.currentTimeMillis();
            while((timer.getSecond() <= secs ) && (timer.getMinute() <= mins) && (timer.getMinute() <= hours)){
                deltaTime = System.currentTimeMillis() - startTime;
                System.out.println("timer.hasChanged = " + timer.hasChanged() + " " + deltaTime / 1000);
                timer.notifyObservers();
                try {
                    Thread.sleep((long)(1000 / pollingRate));
                } catch (InterruptedException ex) {
                    Logger.getLogger(DigitalClock.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            timer.stop();
        }).start();
    }
}
