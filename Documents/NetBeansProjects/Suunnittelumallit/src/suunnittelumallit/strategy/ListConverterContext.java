/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.strategy;

import java.util.List;

/**
 *
 * @author tanel
 */
public class ListConverterContext{
    private ListConverter strategy;
    
    public ListConverterContext(ListConverter strategy){
        this.strategy = strategy;
    }
    
    public ListConverterContext(){
        this.strategy = ListConverter.strategy1();
    }
    
    public void setStrategy(ListConverter strategy){
        this.strategy = strategy;
    }
    
    public String listToString(List<?> list){
        return strategy.listToString(list);
    }
    
    
}
