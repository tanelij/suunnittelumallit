package suunnittelumallit.factorymethod;

public class Rehtori extends AterioivaOtus {

    @Override
    public Juoma createJuoma(){
        return new Viini();
    }



}
