/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.strategy;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author tanel
 */
@FunctionalInterface
public interface ListConverter {
    String listToString(List<?> list);
    
    static ListConverter strategy1(){
        return list -> {
            String listString = "";
            Iterator<?> iterator = list.iterator();
            
            while(iterator.hasNext()){
                listString += iterator.next();
                listString += "\n";
            }
            
            return listString;
        };
    }
    
    static ListConverter strategy2(){
        return list -> {
            String listString = "";
            Object[] array = list.toArray();
            final int LAST_ELEMENT_INDEX = array.length-1;
            
            for(int i=0; i<LAST_ELEMENT_INDEX; i++){
                listString += array[i] + ", ";
                if(i % 2 == 0){
                    listString += "\n";
                }
            }
            if(LAST_ELEMENT_INDEX >= 0){
                listString += array[LAST_ELEMENT_INDEX];
            }
            
            return listString;
        };
    }
    
    static ListConverter strategy3(){
        return list -> {
            String listString = "";
            final int LAST_ELEMENT_INDEX = list.size()-1;
            
            for(int i=0; i<LAST_ELEMENT_INDEX; i++){
                listString += list.get(i) + ", ";
                if(i % 3 == 0){
                    listString += "\n";
                }
            }
            if(LAST_ELEMENT_INDEX >= 0){
                listString += list.get(LAST_ELEMENT_INDEX);
            }
            
            return listString;
        };
    }
    
}
