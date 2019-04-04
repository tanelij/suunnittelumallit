/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.decorator;


public class PepperoniDecorator extends PizzaDecorator {

    public PepperoniDecorator(Pizza p) {
        super(p);
    }
    
    @Override
    public double getHinta(){
        return super.getHinta() + Täyte.PEPPERONI.hinta();
    }
    
    @Override
    public String getKuvaus(){
        return super.getKuvaus() + ", " +  Täyte.PEPPERONI.nimi();
    }
}
