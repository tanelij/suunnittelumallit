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

public class Pokemon{

    State state;
    
    public Pokemon(State s){
        state = s;
    }

    public void attack() {
        state.attack();
    }

    public void rest() {
        state.rest();
    }

    
    public void evolve(){
        State prevState = state;
        state.evolve(this);
        State nextState = state;

        if(prevState == nextState){
            System.out.println(state + " Has reached its final state and can't evolve any further.");
        }else{
            System.out.println(prevState + " evolved into " + nextState);
        }
    }
    
    public void setState(State s){
        state = s;
    }
}

