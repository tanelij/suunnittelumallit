/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author tanel
 */
public class Main {
    public static void main(String[] args){
       BuilderDirector director = new BuilderDirector(new HesburgerBuilder());
       Hamburger hamburger = director.construct();
       System.out.println("Hesburger builder: " + hamburger);
       
       director = new BuilderDirector(new McDonaldsBuilder());
       hamburger = director.construct();
       System.out.println("McDonalds builder: " + hamburger);
    }
}


class Hamburger{
    private String[] parts;

    public Hamburger(String... parts){
        this.parts = parts;
    }

    @Override
    public String toString(){
        return "Hamburger with: " + Arrays.toString(parts);
    }
}

interface  HamburgerBuilder{
    public void buildBun();
    public void buildPatty();
    public void buildCondiments();
    public Hamburger getBurger();
}

class BuilderDirector{
    private HamburgerBuilder builder;

    public BuilderDirector(HamburgerBuilder builder){
        this.builder = builder;
    }

    public Hamburger construct(){
        builder.buildBun();
        builder.buildPatty();
        builder.buildCondiments();

        return builder.getBurger();
    }
}

class HesburgerBuilder implements HamburgerBuilder{
    private List<HamburgerPart> parts = new ArrayList<>();

    @Override
    public void buildBun() {
        parts.add(new HamburgerBun("sesame seed bun"));
    }

    @Override
    public void buildPatty() {
        parts.add(new HamburgerPatty("ground beef patty"));
    }

    @Override
    public void buildCondiments() {
        parts.add(new HamburgerCondiments("lettuce, pickles, ketchup"));
    }

    @Override
    public Hamburger getBurger() {
        String[] partsArray = new String[parts.size()];
        for(int i=0; i<partsArray.length; i++){
            partsArray[i] = parts.get(i).toString();
        }
        return new Hamburger(partsArray);
    }

    private abstract class HamburgerPart{
        private String description;

        public HamburgerPart (String description){
            this.description = description;
        }

        @Override 
        public String toString(){
            return description;
        }
    }

    private class HamburgerBun extends HamburgerPart{

        public HamburgerBun(String description) {
            super(description);
        }

    }

    private class HamburgerPatty extends HamburgerPart{

        public HamburgerPatty(String description) {
            super(description);
        }

    }

    private class HamburgerCondiments extends HamburgerPart{

        public HamburgerCondiments(String description) {
            super(description);
        }

    }

}

class McDonaldsBuilder implements HamburgerBuilder{

    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void buildBun() {
        stringBuilder.append("sesame seed bun,");
    }

    @Override
    public void buildPatty() {
        stringBuilder.append("ground beef patty,");
    }

    @Override
    public void buildCondiments() {
        stringBuilder.append("lettuce,pickles,ketchup");
    }

    @Override
    public Hamburger getBurger() {
        return new Hamburger(stringBuilder.toString().split(","));
    }
}
        

