package suunnittelumallit.factorymethod;

public class Opettaja extends AterioivaOtus {

    @Override
    public Juoma createJuoma(){
        return new Vesi();
    };

}
