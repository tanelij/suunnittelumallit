/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.decorator;

/**
 *
 * @author tanel
 */
public enum Täyte {
    KINKKU ("kinkku", 1.2),
    ANANAS ("ananas", 1),
    PEPPERONI ("pepperoni", 1.5);
    
    private final double hinta;
    private final String nimi;
    
    Täyte(String n, double h){
        hinta = h;
        nimi = n;
    }
    
    String nimi(){return nimi;}
    double hinta(){return hinta;}
}
