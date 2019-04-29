/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.visitor;

public class Normaali extends State{

    private static Normaali instance;
    
    private Normaali(){
        
    }
    
    public static Normaali getInstance(){
        if(instance == null){
            instance = new Normaali();
        }
        return instance;
    }
    
    @Override
    public void nextState(PelihahmoA hahmo) {
        visitor.visit(this, hahmo);
    }
    
    @Override
    public void nextState(PelihahmoB hahmo) {
        visitor.visit(this, hahmo);
    }
}
