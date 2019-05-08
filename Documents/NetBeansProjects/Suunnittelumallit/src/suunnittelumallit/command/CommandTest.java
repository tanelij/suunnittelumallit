/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.command;

/**
 *
 * @author tanel
 */
public class CommandTest {
    public static void main(String[] args){
        Valkokangas valkokangas = new Valkokangas();
        
        Command kangasYlös = new ValkokangasYlös(valkokangas);
        Command kangasAlas = new ValkokangasAlas(valkokangas);
        
        Painike ylösPainike = new Painike(kangasYlös);
        Painike alasPainike = new Painike(kangasAlas);
        
        ylösPainike.paina();
        alasPainike.paina();
    }
}

class Painike{
    Command command;
    
    public Painike(Command command){
        this.command = command;
    }
    
    public void paina(){
        command.execute();
    }
}

class Valkokangas{
    private boolean ylhäällä = false;
    
    public void setYlös(){
        this.ylhäällä = true;
        System.out.println(this);
    }
    
    public void setAlas(){
        this.ylhäällä = false;
        System.out.println(this);
    }
    
    @Override 
    public String toString(){
        return "Valkokangas on " + ((ylhäällä) ? "ylhäällä" : "alhaalla");
    }
}

interface Command{
    public void execute();
}

class ValkokangasYlös implements Command{
    private Valkokangas valkokangas;
    
    public ValkokangasYlös(Valkokangas valkokangas){
        this.valkokangas = valkokangas;
    }
    
    @Override
    public void execute() {
        valkokangas.setYlös();
    }
}

class ValkokangasAlas implements Command{
    private Valkokangas valkokangas;
    
    public ValkokangasAlas(Valkokangas valkokangas){
        this.valkokangas = valkokangas;
    }
    
    @Override
    public void execute() {
        valkokangas.setAlas();
    }
}