/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.strategy;

import java.util.ArrayList;

/**
 *
 * @author tanel
 */
public class Main {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        ListConverterContext listConverter = new ListConverterContext();
        
        for(int i=0; i<20; i++){
            list.add(i);
        }
        
        listConverter.setStrategy(ListConverter.strategy1());
        System.out.println("Result with strategy1:\n" 
                + listConverter.listToString(list));
        
        listConverter.setStrategy(ListConverter.strategy2());
        System.out.println("Result with strategy2:\n" 
                + listConverter.listToString(list));
        
        listConverter.setStrategy(ListConverter.strategy3());
        System.out.println("Result with strategy3:\n" 
                + listConverter.listToString(list));
    }
}
