/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.decorator;


public class AnanasDecorator extends PizzaDecorator {

    public AnanasDecorator(Pizza p) {
        super(p);
    }
    
    @Override
    public double getHinta(){
        return super.getHinta() + Täyte.ANANAS.hinta();
    }
    
    @Override
    public String getKuvaus(){
        return super.getKuvaus() + ", " +  Täyte.ANANAS.nimi();
    }
}
