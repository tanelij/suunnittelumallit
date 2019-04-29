/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.visitor;










public class Vaikea extends State{

    private static Vaikea instance;
    
    private Vaikea(){
        
    }
    
    public static Vaikea getInstance(){
        if(instance == null){
            instance = new Vaikea();
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
