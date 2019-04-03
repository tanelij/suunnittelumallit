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
public class PcComponent implements Leaf{

    int hinta;
    
    public PcComponent(int hinta){
        this.hinta = hinta;
    }
    
    @Override
    public int getHinta() {
        return this.hinta;
    }
    
}
