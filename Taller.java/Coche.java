public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche(String matricula, String modelo, int numPuertas) {
        super(matricula, modelo);
        this.numPuertas = numPuertas;
    }
}
