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
public class AdidasTehdas extends VaateTehdas{
    public static final String TUOTEMERKIN_NIMI = "Adidas";

    @Override
    public Farmarit makeFarmarit() {
        return new AdidasFarmarit();
    }

    @Override
    public TPaita makeTPaita() {
        return new AdidasTPaita();
    }

    @Override
    public Lippis makeLippis() {
        return new AdidasLippis();
    }

    @Override
    public Kengät makeKengät() {
        return new AdidasKengät();
    }



}
