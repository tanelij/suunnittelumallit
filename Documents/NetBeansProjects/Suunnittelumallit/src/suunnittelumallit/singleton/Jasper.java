/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.singleton;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author tanel
 */
public class Jasper {
    private VaateTehdas vaateTehdas;
    private Vaate[] vaatteet;
    
    public Jasper(VaateTehdas vaateTehdas){
        this.vaateTehdas = vaateTehdas;
    }
        
    public void pueVaatteet(){
        vaatteet = vaateTehdas.makeAll();
    }

    /**
     * @return the vaateTehdas
     */
    public VaateTehdas getVaateTehdas() {
        return vaateTehdas;
    }

    /**
     * @param vaateTehdas the vaateTehdas to set
     */
    public void setVaateTehdas(VaateTehdas vaateTehdas) {
        this.vaateTehdas = vaateTehdas;
    }
    
    public void tulostaVaatetus(){
        List<Vaate> vaateList = new ArrayList<>(Arrays.asList(vaatteet));
        System.out.println(String.join(",", vaateList.toString()));
    }
}
