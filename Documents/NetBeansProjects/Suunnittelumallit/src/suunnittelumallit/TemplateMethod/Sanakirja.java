/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.TemplateMethod;

import java.util.Random;

/**
 *
 * @author tanel
 */
public class Sanakirja {
    private Random random = new Random();
    private int indeksi = 0;
    private String[] sanat = {
        "suunnittelumalli",
        "tehdasfunktio",
        "kuorruttaja",
        "ohjelmointikieli",
        "kapselointi",
        "rajapinta",
        "relaatiotietokanta"
    };
    
    
    public String satunnainenSana(){
        return sanat[random.nextInt(sanat.length)];
    }
    
    public String seuraavaSana(){
        if(indeksi >= sanat.length){
            indeksi = 0;
        }
        return sanat[indeksi];
    }
}
