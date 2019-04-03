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
public class AdidasKengät extends Kengät {

    public AdidasKengät() {
    }
    
    @Override
    public String toString(){
        return AdidasTehdas.TUOTEMERKIN_NIMI + super.toString(); 
    }
}
