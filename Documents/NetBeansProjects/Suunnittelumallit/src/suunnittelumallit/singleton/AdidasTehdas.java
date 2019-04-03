/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.singleton;


import java.util.ArrayList;



/**
 *
 * @author tanel
 */
public class AdidasTehdas extends VaateTehdas{
    private final VaateMerkki VAATEMERKKI = VaateMerkki.ADIDAS;
    private static VaateTehdas instance;
    
    private AdidasTehdas(){}

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
        ArrayList<Vaate> vaateList = new ArrayList<>();
        for(VaateTyyppi tyyppi : VaateTyyppi.values()){
            vaateList.add(new Vaate(tyyppi, VAATEMERKKI));
        }
        return vaateList.toArray(new Vaate[vaateList.size()]);
    }

    public static VaateTehdas getInstance() throws IllegalAccessException, InstantiationException {
        if(instance == null){
            instance = AdidasTehdas.class.newInstance();
        }
        return instance;
    }
}
