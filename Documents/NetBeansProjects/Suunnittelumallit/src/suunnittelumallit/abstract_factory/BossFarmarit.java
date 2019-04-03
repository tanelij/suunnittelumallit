/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.abstract_factory;

/**
 *
 * @author tanel
 */
public class BossFarmarit extends Farmarit {

    public BossFarmarit() {
    }
    
    @Override
    public String toString(){
        return BossTehdas.TUOTEMERKIN_NIMI + super.toString(); 
    }
}
