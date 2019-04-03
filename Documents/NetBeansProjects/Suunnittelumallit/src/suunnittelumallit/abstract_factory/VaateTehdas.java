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
abstract class VaateTehdas {
    public abstract Farmarit makeFarmarit();
    public abstract TPaita makeTPaita();
    public abstract Lippis makeLippis();
    public abstract Kengät makeKengät();
}
