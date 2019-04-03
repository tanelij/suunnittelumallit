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
public enum VaateTyyppi {
    FARMARIT("farmarit"), TPAITA("t-paita"), LIPPIS("lippis"), KENGÄT("kengät");
    private String nimi;

    VaateTyyppi(String nimi) {
        this.nimi = nimi;
    }

    String getNimi() {
        return nimi;
    }
    
}
