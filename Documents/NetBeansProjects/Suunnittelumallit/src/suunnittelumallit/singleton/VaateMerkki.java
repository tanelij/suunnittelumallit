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
public enum VaateMerkki {
    ADIDAS("Adidas"), BOSS("Boss");
    private String nimi;

    VaateMerkki(String nimi) {
        this.nimi = nimi;
    }

    String getNimi() {
        return nimi;
    }
    
}
