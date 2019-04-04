/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.decorator;

/**
 *
 * @author tanel
 */
public abstract class PizzaDecorator implements Pizza{
    private final Pizza pizzaToDecorate;
    
    public PizzaDecorator(Pizza p){
        pizzaToDecorate = p;
    }
    
    @Override
    public double getHinta(){
        return pizzaToDecorate.getHinta();
    }
    
    @Override
    public String getKuvaus(){
        return pizzaToDecorate.getKuvaus();
    }
}
