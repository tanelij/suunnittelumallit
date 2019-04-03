/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.abstract_factory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tanel
 */
public class Jasper {
    private VaateTehdas vaateTehdas;
    private Farmarit farmarit;
    private Kengät kengät;
    private TPaita TPaita;
    private Lippis Lippis;
    
    public Jasper(VaateTehdas vaateTehdas){
        this.vaateTehdas = vaateTehdas;
    }
        
    public void pueVaatteet(){
        farmarit = vaateTehdas.makeFarmarit();
        kengät = vaateTehdas.makeKengät();
        TPaita = vaateTehdas.makeTPaita();
        Lippis = vaateTehdas.makeLippis();
    }
    
    public static void main(String[] args){
        try {
            Jasper jasper = new Jasper(AdidasTehdas.class.newInstance());
            jasper.pueVaatteet();
            jasper.tulostaVaatetus();
            
            jasper.setVaateTehdas(BossTehdas.class.newInstance());
            jasper.pueVaatteet();
            jasper.tulostaVaatetus();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Jasper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * @return the vaateTehdas
     */
    public VaateTehdas getVaateTehdas() {
        return vaateTehdas;
    }

    /**
     * @param vaateTehdas the vaateTehdas to set
     */
    public void setVaateTehdas(VaateTehdas vaateTehdas) {
        this.vaateTehdas = vaateTehdas;
    }
    
    public void tulostaVaatetus(){
        System.out.println("Päälläni on: " + farmarit + ", " + kengät
        + ", " + TPaita + ", " + Lippis);
    }
}
