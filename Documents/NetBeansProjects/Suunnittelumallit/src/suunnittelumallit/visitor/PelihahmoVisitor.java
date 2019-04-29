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
public class PelihahmoVisitor {
    public void visit(Helppo helppo, PelihahmoA hahmo){
        hahmo.annaBonusPisteitä(1000);
        hahmo.setState(Normaali.getInstance());
    }
    
    public void visit(Normaali normaali, PelihahmoA hahmo){
        hahmo.annaBonusPisteitä(500);
        hahmo.setState(Vaikea.getInstance());
    }
        
    public void visit(Vaikea vaikea, PelihahmoA hahmo){
        hahmo.annaBonusPisteitä(250);
        hahmo.setState(Helppo.getInstance());
    }
    
    public void visit(Helppo helppo, PelihahmoB hahmo){
        hahmo.annaBonusPisteitä(1000 + 1000);
        hahmo.setState(Normaali.getInstance());
    }
    
    public void visit(Normaali normaali, PelihahmoB hahmo){
        hahmo.annaBonusPisteitä(500 + 1000);
        hahmo.setState(Vaikea.getInstance());
    }
        
    public void visit(Vaikea vaikea, PelihahmoB hahmo){
        hahmo.annaBonusPisteitä(250 + 1000);
        hahmo.setState(Helppo.getInstance());
    }
}
