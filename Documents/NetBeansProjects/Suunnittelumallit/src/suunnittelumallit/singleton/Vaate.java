/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.singleton;


/**
 *
 * @author tanel
 */


public class Vaate{
    
    private final VaateTyyppi tyyppi;
    private final VaateMerkki merkki;
            
    public Vaate(VaateTyyppi t, VaateMerkki m){
        tyyppi = t;
        merkki = m;
    }
    
    @Override
    public String toString(){
        return merkki.getNimi() + "-" + tyyppi.getNimi();
    }
    
    
}