/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.adapter;

/**
 *
 * @author tanel
 */
public class Main {
    public static void main(String[] args){
        Multiplier multiplier = new ComplexCalculator();
        System.out.println(multiplier.multiply(4, 6));
    }

}

interface Multiplier{
    public int multiply(int a, int b);
}

class SimpleCalculator{
    public int add(int a, int b){
        return a+b;
    }
    
    public int subtract(int a, int b){
        return a-b;
    }
}

class ComplexCalculator extends SimpleCalculator implements Multiplier{

    @Override
    public int multiply(int a, int b) {
        int sum = 0;
        
        for(int i=0; i<b; i++){
            sum = add(sum, a);
        }
        
        return sum;
    }
    
}