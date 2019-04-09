/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.chainOfResponsibility;

import java.util.Random;

/**
 *
 * @author tanel
 */
public abstract class PalkanKorottaja {
    protected PalkanKorottaja nextHandler;
    protected double yläraja;
    Random random = new Random();
    
    @Override
    abstract public String toString();
        
    public final PalkanKorottaja setNext(PalkanKorottaja korotusHandler){
        this.nextHandler = korotusHandler;
        return this.nextHandler;
    }
    
    public void handleKorotus(double prosentti){
        if(canHandle(prosentti)){
            System.out.println("Palkankorotuksen käsittelee " + this);
            if(random.nextBoolean()){
                System.out.println(this + " hyväksyi palkankorotuksen!!!");
            }else{
                System.out.println(this + " hylkäsi palkankorotuksen...");
            }
        }else{
            nextHandler.handleKorotus(prosentti);
        }
    }
    
    protected boolean canHandle(double prosentti){
        return prosentti <= yläraja;
    }
}

class Test{
    
    public static void main(String[] args){
        PalkanKorottaja korotusHandler = new LähiEsimies();
        korotusHandler.setNext(new YksikönPäällikkö())
                .setNext(new Toimitusjohtaja());
                
        
        for(int i=1; i<8; i++){
            System.out.println("\nTyöntekijä pyytää " + i + "% palkankorotusta...");
            korotusHandler.handleKorotus(i);
        }
        
    }
}
    

class LähiEsimies extends PalkanKorottaja{
    
    public LähiEsimies(){
        yläraja = 2;
    }

    @Override
    public String toString() {
        return "lähiesimies";
    }
    
}

class YksikönPäällikkö extends PalkanKorottaja{
    
    public YksikönPäällikkö(){
        yläraja = 5;
    }
    
    @Override 
    protected boolean canHandle(double prosentti){
        return prosentti < yläraja;
    }
    
    @Override
    public String toString() {
        return "yksikön päällikkö";
    }
}

class Toimitusjohtaja extends PalkanKorottaja{

    public Toimitusjohtaja(){
        yläraja = Double.MAX_VALUE;
    }
 
    @Override
    public String toString() {
        return "toimitusjohtaja";
    }
    
}