/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.singleton;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author tanel
 */
class BossTehdas extends VaateTehdas{
    private final VaateMerkki VAATEMERKKI = VaateMerkki.BOSS;
    private static VaateTehdas instance;
    
    private BossTehdas(){}
    @Override
    public Vaate makeFarmarit() {
        return new Vaate(VaateTyyppi.FARMARIT, VAATEMERKKI);
    }

    @Override
    public Vaate makeTPaita() {
        return new Vaate(VaateTyyppi.TPAITA, VAATEMERKKI);
    }

    @Override
    public Vaate makeLippis() {
        return new Vaate(VaateTyyppi.LIPPIS, VAATEMERKKI);
    }

    @Override
    public Vaate makeKengät() {
        return new Vaate(VaateTyyppi.KENGÄT, VAATEMERKKI);
    }

    @Override
    public Vaate[] makeAll() {
        VaateTyyppi[] tyypit = VaateTyyppi.values();
        Vaate[] vaatteet = new Vaate[tyypit.length];
        for(int i=0; i<tyypit.length; i++){
            vaatteet[i] = new Vaate(tyypit[i], VAATEMERKKI);
        }
        return vaatteet;
    }

    public static VaateTehdas getInstance() throws InstantiationException, IllegalAccessException {
        if(instance == null){
            instance = BossTehdas.class.newInstance();
        }
        return instance;
    }
}
