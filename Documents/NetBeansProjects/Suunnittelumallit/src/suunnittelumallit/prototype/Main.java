/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tanel
 */
public class Main {
        public static void main(String[] args){
        try {
            Kello kello = new Kello();
            Kello klooni = kello.clone();
            
            klooni.tick();
            klooni.tick();
            klooni.tick();
            
            System.out.println("Kellon aika: " + kello.getAika());
            System.out.println("Kloonatun kellon aika: " + klooni.getAika());
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Kello.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
