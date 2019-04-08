/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.TemplateMethod;

/**
 *
 * @author tanel
 */
public class HirsipuuSana {
    private String sana;
    private char[] kirjaimet;
    private boolean[] arvatut; 
    public HirsipuuSana(String sana){
        this.sana = sana.toUpperCase();
        this.kirjaimet = this.sana.toCharArray();
        this.arvatut = new boolean[kirjaimet.length];
    }
    
    public void arvaaKirjainta(char k){
        char kirjain = Character.toUpperCase(k);
        
        for(int i=0; i<kirjaimet.length; i++){
            if(kirjaimet[i] == kirjain){
                arvatut[i] = true;
            }
        }
        
    }
    
    public boolean arvaaSanaa(String a){
        String arvaus = a.toUpperCase();
        return (arvaus == null ? this.sana == null : arvaus.equals(this.sana));
    }
    
    public boolean kirjaimiaJäljellä(){
        for(boolean b : arvatut){
            if(b != true){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString(){
        String printattavaSana = "";
        
        for(int i=0; i<arvatut.length; i++){
            if(arvatut[i] == true){
                printattavaSana += kirjaimet[i];
            }else{
                printattavaSana += "_";
            }
            printattavaSana += " ";
        }
        
        return printattavaSana;
        
    }

}
