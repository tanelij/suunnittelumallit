/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.singleton;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tanel
 */
public abstract class VaateTehdas {
    
    private static HashMap<VaateMerkki, VaateTehdas> tehdasMap
            = new HashMap<>();
    

    
    VaateTehdas(){};
    
    public abstract Vaate makeFarmarit();
    public abstract Vaate makeTPaita();
    public abstract Vaate makeLippis();
    public abstract Vaate makeKengät();
    public abstract Vaate[] makeAll();
    
    
    public static VaateTehdas getInstance(VaateMerkki merkki){
        VaateTehdas tehdas = null;
        try {
            switch(merkki){
                case BOSS:
                    tehdas = BossTehdas.getInstance();
                    break;
                case ADIDAS:
                    tehdas = AdidasTehdas.getInstance();
                    break;
                default:
                    tehdas = null;
            }
        } catch (IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(VaateTehdas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tehdas;
    }

}
