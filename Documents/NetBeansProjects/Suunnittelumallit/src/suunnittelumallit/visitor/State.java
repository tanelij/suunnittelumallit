/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.visitor;





/**
 *
 * @author tanel
 */
public abstract class State{
    protected PelihahmoVisitor visitor = new PelihahmoVisitor();

    abstract public void nextState(PelihahmoA hahmo);
    abstract public void nextState(PelihahmoB hahmo);
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
