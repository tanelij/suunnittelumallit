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
public class Charizard implements State{

    private final String NAME = "Charizard";
    private final int DMG = 100;

    
    @Override
    public void attack() {
        System.out.println(this + " attacked dealing " + DMG + " damage!");
    }

    @Override
    public void rest() {
        System.out.println(this + " is too old to rest...");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        
    }
    
    @Override
    public String toString(){
        return NAME;
    }

}
