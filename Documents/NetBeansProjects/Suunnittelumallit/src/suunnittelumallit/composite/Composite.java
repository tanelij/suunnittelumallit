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
public interface Composite extends Component{
    public void addComponent(Component component);
    public void removeComponent(Component component);
    public Component getComponent(int i);
    public Component removeComponent(int i);
}
