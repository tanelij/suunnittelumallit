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
public class Main {
    public static void main(String[] arsg){
        Pokemon pokemon = new Pokemon(new Charmander());
 
        for(int i=0; i<3; i++){
            pokemon.attack();
            pokemon.rest();
            pokemon.evolve();
            System.out.println();
        }
    }
}
