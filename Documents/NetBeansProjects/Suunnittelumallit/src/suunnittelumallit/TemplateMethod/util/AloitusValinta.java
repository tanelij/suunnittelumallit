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
public enum AloitusValinta {
    LOPETA("lopeta", "1"),
    UUSI_PELI("uusi peli", "2");

    private final String nimi;
    public final String SYÖTE;
    AloitusValinta(String nimi, String syöte){
        this.nimi = nimi;
        this.SYÖTE = syöte;
    }

    public String nimi(){return this.nimi;};
}
