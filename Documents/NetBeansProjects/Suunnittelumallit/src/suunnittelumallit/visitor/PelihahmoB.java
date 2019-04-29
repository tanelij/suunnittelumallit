/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.visitor;

public class PelihahmoB extends Pelihahmo{

    private int pisteet = 0;
    private State state;

    public PelihahmoB(State state) {
        this.state = state;
    }

    @Override
    public void annaBonusPisteitä(int bonusPisteet) {
        this.pisteet += bonusPisteet;
        System.out.println(this + " sai " + bonusPisteet + " pistettä!");
    }
    
    @Override
    public void setState(State nextState){
        State previousState = this.state;
        this.state = nextState;
        System.out.println(this + " tila vaihtui tilasta: " + 
                previousState + " tilaan: " + nextState);
    }
    
    @Override
    public void nextState(){
        this.state.nextState(this);
    }
    
}
