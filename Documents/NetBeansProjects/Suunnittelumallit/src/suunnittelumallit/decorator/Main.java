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
public class Main {
    public static void main(String[] args){
        printPizza(makePizza(Täyte.KINKKU, Täyte.ANANAS));
        printPizza(makePizza(Täyte.KINKKU, Täyte.PEPPERONI));
        printPizza(makePizza(Täyte.PEPPERONI));
    }
    
    public static Pizza makePizza(Täyte... täytteet){
        Pizza pizza = new PizzaPohja();
        
        for(Täyte t : täytteet){
            switch(t){
                case KINKKU:
                    pizza = new KinkkuDecorator(pizza);
                break;
                case ANANAS:
                    pizza = new AnanasDecorator(pizza);
                break;
                case PEPPERONI:
                    pizza = new PepperoniDecorator(pizza);
                break;
            }
        }
        return pizza;
    }
    
    public static void printPizza(Pizza pizza){
        System.out.println("Pizzan hinta: " + pizza.getHinta());
        System.out.println("Pizzan kuvaus: " + pizza.getKuvaus());
    }
}
