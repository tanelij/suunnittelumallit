/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.memento;

/**
 *
 * @author tanel
 */
public class Main {
        
    public static void main(String[] args){
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Thread arvaaja1 = new Thread(new Arvaaja(arvuuttaja));
        Thread arvaaja2 = new Thread(new Arvaaja(arvuuttaja));
        Thread arvaaja3 = new Thread(new Arvaaja(arvuuttaja));
        arvaaja1.setName("arvaaja1");
        arvaaja2.setName("arvaaja2");
        arvaaja3.setName("arvaaja3");
        
        arvaaja1.start();
        arvaaja2.start();
        arvaaja3.start();
    }

    private static class Arvaaja implements Runnable{
        Object memento;
        Arvuuttaja arvuuttaja;
        
        public Arvaaja (Arvuuttaja arvuuttaja){
            this.arvuuttaja = arvuuttaja;
        }
        
        @Override
        public void run() {
            this.memento = arvuuttaja.liityPeliin();
            while(!arvuuttaja.arvaa(memento)){
                
            }
            System.out.println(Thread.currentThread().getName() + " arvasi oikein!");
        }
    }
}

