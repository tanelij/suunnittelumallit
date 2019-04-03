/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.singleton;

/**
 *
 * @author tanel
 */
public class Testi {
    public static void main(String[] args){

        Jasper jasper = new Jasper(VaateTehdas.getInstance(VaateMerkki.ADIDAS));
        jasper.pueVaatteet();
        jasper.tulostaVaatetus();

        jasper.setVaateTehdas(VaateTehdas.getInstance(VaateMerkki.BOSS));
        jasper.pueVaatteet();
        jasper.tulostaVaatetus();

        VaateTehdas[] tehtaat = new VaateTehdas[5];
        for(int i=0; i<tehtaat.length; i++){
            tehtaat[i] = VaateTehdas.getInstance(VaateMerkki.BOSS);
        }
        
        for(int i=1; i<tehtaat.length; i++){
            System.out.println("tehtaat[0] == tehtaat[" + i + "] " + (tehtaat[0] == tehtaat[i]));
        }
    }
}
