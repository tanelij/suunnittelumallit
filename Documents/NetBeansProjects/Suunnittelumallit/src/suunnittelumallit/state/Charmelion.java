/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.state;



/**
 *
 * @author tanel
 */
public class Charmelion implements State{

    public final String NAME = "Charmelion";
    private final int DMG = 20;
    private final int REGEN = 20;
    
    @Override
    public void attack() {
        System.out.println(this + " attacked dealing " + DMG + " damage!");
    }

    @Override
    public void rest() {
        System.out.println(this + " took a rest healing " + REGEN + " hp!");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        pokemon.setState(new Charizard());
    }

    @Override
    public String toString(){
        return NAME;
    }
    
}
