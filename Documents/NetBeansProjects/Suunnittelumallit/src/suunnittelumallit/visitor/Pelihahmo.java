/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.visitor;

import java.util.HashMap;

/**
 *
 * @author tanel
 */
abstract class Pelihahmo{
    private static HashMap<Class<? extends Pelihahmo>, Integer> ids = new HashMap<>();
    protected final int id;
    
    public Pelihahmo(){
        id = ids.computeIfAbsent(this.getClass(), Class -> 1);
        ids.replace(this.getClass(), id+1);
    }
    
    abstract void annaBonusPisteitä(int bonusPisteet);
    
    abstract void setState(State nextState);
    
    abstract void nextState();
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + id;
    }
}

