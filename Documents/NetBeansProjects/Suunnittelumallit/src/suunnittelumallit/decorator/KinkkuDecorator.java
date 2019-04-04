/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.decorator;


public class KinkkuDecorator extends PizzaDecorator {

    public KinkkuDecorator(Pizza p) {
        super(p);
    }
    
    @Override
    public double getHinta(){
        return super.getHinta() + Täyte.KINKKU.hinta();
    }
    
    @Override
    public String getKuvaus(){
        return super.getKuvaus() + ", " +  Täyte.KINKKU.nimi();
    }
}
