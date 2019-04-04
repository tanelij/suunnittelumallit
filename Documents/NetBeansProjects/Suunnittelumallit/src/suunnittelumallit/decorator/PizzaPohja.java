/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.decorator;


public class PizzaPohja implements Pizza {

    @Override
    public double getHinta() {
        return 1.3;
    }

    @Override
    public String getKuvaus() {
        return "Pohja";
    }
    
}
