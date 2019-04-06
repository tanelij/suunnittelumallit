/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.state;

import suunnittelumallit.state.*;

/**
 *
 * @author tanel
 */
public class Charmander implements State{

    public final String NAME = "Charmander";
    
    @Override
    public void attack() {
        System.out.println(this + " is too young to attack...");
    }

    @Override
    public void rest() {
        System.out.println(this + " hasn't learned rest yet...");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        pokemon.setState(new Charmelion());
    }
    
    @Override
    public String toString(){
        return NAME;
    }
    
}
