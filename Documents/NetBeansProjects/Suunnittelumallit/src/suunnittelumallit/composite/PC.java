/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.composite;

/**
 *
 * @author tanel
 */
public class PC {
    public static void main(String[] args){
        ComplexPcComponent pc = new ComplexPcComponent(0);
        
        Component ulkoinenKovaLevy = new PcComponent(50);
        pc.addComponent(ulkoinenKovaLevy);
        
        ComplexPcComponent kotelo = new ComplexPcComponent(100);
        pc.addComponent(kotelo);
        
        ComplexPcComponent emoLevy = new ComplexPcComponent(50);
        kotelo.addComponent(emoLevy);
        
        Component muistiPiiri1 = new PcComponent(25);
        emoLevy.addComponent(muistiPiiri1);
        
        Component muistiPiiri2 = new PcComponent(25);
        emoLevy.addComponent(muistiPiiri2);
        
        Component prosessori = new PcComponent(200);
        emoLevy.addComponent(prosessori);
        
        Component näytönOhjain = new PcComponent(300);
        emoLevy.addComponent(näytönOhjain);
        
        Component kovaLevy = new PcComponent(70);
        emoLevy.addComponent(kovaLevy);

        
        System.out.println("Tietokoneen hinta on: " + pc.getHinta());
    }
}


