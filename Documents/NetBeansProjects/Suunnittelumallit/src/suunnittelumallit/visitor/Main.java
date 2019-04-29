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
public class Main {
    public static void main(String[] args){
        Pelihahmo[] hahmot = {
            new PelihahmoA(Helppo.getInstance()),
            new PelihahmoA(Normaali.getInstance()),
            new PelihahmoA(Vaikea.getInstance()),
            new PelihahmoB(Helppo.getInstance()),
            new PelihahmoB(Normaali.getInstance()),
            new PelihahmoB(Vaikea.getInstance())
        };

        for(int i=0; i<3; i++){
            for(Pelihahmo hahmo : hahmot){
                hahmo.nextState();
            }
            System.out.println();
        }
        
    }
}
