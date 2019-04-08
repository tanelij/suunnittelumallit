/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.TemplateMethod.util;

import java.util.Scanner;

/**
 *
 * @author tanel
 */
public class PelaajaInput {
    private static Scanner scanner = new Scanner(System.in);
    
    public static char haeKirjain(){
        char kirjain = ' ';
        boolean virhe;
        
        do{
            virhe = false;
            System.out.println("Syötä arvattava kirjain:");
            String syöte = scanner.next();
            
            if(syöte.length() > 0 && Character.isAlphabetic(syöte.charAt(0))){
                kirjain = syöte.charAt(0);
            }else{
                System.out.println("Virheellinen syöte!");
                virhe = true;
            }
            
        }while(virhe);
        
        return kirjain;
    }
    
    public static String haeSana(){
        String sana;
        boolean virhe;
        
        do{
            virhe = false;
            System.out.println("Syötä arvauksesi:");
            sana = scanner.next();
            
            if(sana.matches("[^a-zA-Z]")){
                virhe = true;
            }
            
            if(virhe){
                System.out.println("Virheellinen syöte!");
            }
        }while(virhe);
        
        return sana;
    }
    
    public static PeliValinta haePeliValinta(){
        boolean virhe;
        PeliValinta valinta = null;
        do{
            virhe = true;
            System.out.println("Valitse jokin seuraavista vaihtehdoista:");
            for(PeliValinta v : PeliValinta.values()){
                System.out.println(v.nimi() + "[" + v.SYÖTE + "]");
            }
            String syöte = scanner.next();
            
            for(PeliValinta v : PeliValinta.values()){
                if(v.SYÖTE.equals(syöte)){
                    valinta = v;
                    virhe = false;
                    break;
                }
            }
            
            if(virhe){
                System.out.println("Virheellinen syöte!");
            }
        }while(virhe);
        
        return valinta;
    }
    
    public static AloitusValinta haeAloitusValinta(){
        boolean virhe;
        AloitusValinta valinta = null;
        
        do{
            virhe = true;
            System.out.println("Valitse jokin seuraavista vaihtehdoista:");
            for(AloitusValinta v : AloitusValinta.values()){
                System.out.println(v.nimi() + "[" + v.SYÖTE + "]");
            }
            String syöte = scanner.next();
            
            for(AloitusValinta v : AloitusValinta.values()){
                if(v.SYÖTE.equals(syöte)){
                    valinta = v;
                    virhe = false;
                    break;
                }
            }
            
            if(virhe){
                System.out.println("Virheellinen syöte!");
            }
        }while(virhe);
        
        return valinta;
    }
}
