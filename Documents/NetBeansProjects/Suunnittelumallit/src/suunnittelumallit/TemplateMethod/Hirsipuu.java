/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.TemplateMethod;
import suunnittelumallit.TemplateMethod.util.*;

/**
 *
 * @author tanel
 */
public class Hirsipuu extends Game{
    private Sanakirja sanakirja = new Sanakirja();
    private int yritykset;
    private boolean oikeaArvaus;
    private String sana;
    private HirsipuuSana arvattava;
    
    
    @Override
    void initializeGame() {
        playersCount = 1;
        yritykset = 5;
        oikeaArvaus = false;
        sana = sanakirja.satunnainenSana();
        arvattava = new HirsipuuSana(sana);
    }

    @Override
    void makePlay(int player) {
        System.out.println("Arvattava sana: " + arvattava);
        System.out.println("Yrityksiä jäljellä: " + yritykset);

        PeliValinta peliValinta = PelaajaInput.haePeliValinta();

        switch(peliValinta){
            case ARVAA_KIRJAIN: 
                char kirjain = PelaajaInput.haeKirjain();
                arvattava.arvaaKirjainta(kirjain);
            break;
            case ARVAA_SANA:
                String arvaus = PelaajaInput.haeSana();
                oikeaArvaus = arvattava.arvaaSanaa(arvaus);
            break;
            case LOPETA:
                System.exit(0);
            break;
        }
        yritykset--;
    }

    @Override
    boolean endOfGame() {
        return oikeaArvaus || !arvattava.kirjaimiaJäljellä() || yritykset <= 0;
    }

    @Override
    void printWinner() {
        if(oikeaArvaus || !arvattava.kirjaimiaJäljellä()){
            System.out.println("Onneksi olkoon, voitit pelin!\n"
                + "Oikea sana oli : " + sana);
        }else{
            System.out.println("Hävisit pelin... :(\n"
                + "Oikea sana oli : " + sana);
        }
    }
    
}
