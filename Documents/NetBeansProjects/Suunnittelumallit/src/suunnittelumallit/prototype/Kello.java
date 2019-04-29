/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.prototype;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tanel
 */
public class Kello implements Cloneable{
    private Viisari tuntiViisari = new TuntiViisari(null);
    private Viisari minuuttiViisari = new MinuuttiViisari(tuntiViisari);
    private Viisari sekuntiViisari = new SekuntiViisari(minuuttiViisari);
    
    public void tick(){
        sekuntiViisari.tick();
    }
    
    public String getAika(){
        return tuntiViisari + ":" 
                + minuuttiViisari + ":" 
                + sekuntiViisari;
    }
    
    @Override public Kello clone() throws CloneNotSupportedException{
        Kello clone = (Kello)super.clone();
        clone.tuntiViisari = tuntiViisari.clone();
        clone.minuuttiViisari = minuuttiViisari.clone();
        clone.sekuntiViisari = sekuntiViisari.clone();
        return clone;
        
    }
    
}

abstract class Viisari implements Cloneable{
    protected int aika = 0;
    private int yläraja;
    private Viisari nextViisari;
    
    public Viisari(int yläraja, Viisari nextViisari){
        this.nextViisari = nextViisari;
        this.yläraja = yläraja;
    }
    
    public void tick(){
        aika++;
        if(aika >= yläraja){
            if(nextViisari != null){
                nextViisari.tick();
            }
            aika = 0;
        }
    }
    
    @Override
    final public String toString(){
        return String.valueOf(aika);
    }
    
    @Override public Viisari clone() throws CloneNotSupportedException{
        return (Viisari)super.clone();
    }
}

class TuntiViisari extends Viisari{
    public TuntiViisari(Viisari nextViisari) {
        super(24, nextViisari);
        aika = GregorianCalendar.getInstance().get(Calendar.HOUR);
    }
}

class MinuuttiViisari extends Viisari{
    public MinuuttiViisari(Viisari nextViisari) {
        super(60, nextViisari);
        aika = GregorianCalendar.getInstance().get(Calendar.MINUTE);
    }
}

class SekuntiViisari extends Viisari{
    public SekuntiViisari(Viisari nextViisari) {
        super(60, nextViisari);
        aika = GregorianCalendar.getInstance().get(Calendar.SECOND);
    }
}