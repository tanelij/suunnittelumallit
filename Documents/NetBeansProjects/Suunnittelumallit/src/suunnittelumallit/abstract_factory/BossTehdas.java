/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.abstract_factory;

/**
 *
 * @author tanel
 */
public class BossTehdas extends VaateTehdas{
    public static final String TUOTEMERKIN_NIMI = "Boss";

    @Override
    public Farmarit makeFarmarit() {
        return new BossFarmarit();
    }

    @Override
    public TPaita makeTPaita() {
        return new BossTPaita();
    }

    @Override
    public Lippis makeLippis() {
        return new BossLippis();
    }

    @Override
    public Kengät makeKengät() {
        return new BossKengät();
    }

    private static class asd{
    
    }

}
