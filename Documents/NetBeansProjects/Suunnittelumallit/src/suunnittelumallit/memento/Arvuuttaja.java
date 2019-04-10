/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.memento;

import java.util.Random;

/**
 *
 * @author tanel
 */
public class Arvuuttaja {
    private final int YLÄRAJA = 10;
    private Random random = new Random();
    
    public Object liityPeliin(){
        System.out.println(Thread.currentThread().getName() + " liittyi peliin.");
        int luku = random.nextInt(YLÄRAJA);
        System.out.println(Thread.currentThread().getName() + " sai luvun: " + luku);
        return new Memento(luku);
    }
    
    public boolean arvaa(Object m){
        Memento memento;
        try{
            memento = (Memento)m;
        }catch (Exception e){
            System.out.println("Virheellinen memento!");
            return false;
        }
        
        int arvaus = random.nextInt(YLÄRAJA);
        System.out.println(Thread.currentThread().getName() + " arvaa " + arvaus);
        return memento.getLuku() == arvaus;
    }
    
    private class Memento
    {
        private final int luku;

        Memento(int luku){
            this.luku = luku;
        }
        
        private int getLuku(){
            return this.luku;
        }
    }
    
}

