/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.TemplateMethod.util;

/**
 *
 * @author tanel
 */
public enum PeliValinta{
    ARVAA_SANA("arvaa sana", "1"),
    ARVAA_KIRJAIN("arvaa kirjain", "2"),
    LOPETA("lopeta peli", "3");

    private final String nimi;
    public final String SYÖTE;
    PeliValinta(String nimi, String syöte){
        this.nimi = nimi;
        this.SYÖTE = syöte;
    }

    public String nimi(){return this.nimi;};
}
