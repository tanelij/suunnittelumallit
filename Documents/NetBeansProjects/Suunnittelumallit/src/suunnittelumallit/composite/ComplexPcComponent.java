/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author tanel
 */
public class ComplexPcComponent implements Composite{
    
    int hinta;
    ArrayList<Component> components = new ArrayList<>();
    
    public ComplexPcComponent(int hinta){
        this.hinta = hinta;
    }

    @Override
    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component getComponent(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component removeComponent(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHinta() {
        int kokonaisHinta = this.hinta;
        for (Component c : components) {
            kokonaisHinta += c.getHinta();
        }
        return kokonaisHinta;
    }
    
}
