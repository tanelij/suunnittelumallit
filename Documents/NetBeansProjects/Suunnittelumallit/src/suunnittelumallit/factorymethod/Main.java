package suunnittelumallit.factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus rehtori = new Rehtori();
        opettaja.aterioi();
        oppilas.aterioi();
        rehtori.aterioi();
    }
}
