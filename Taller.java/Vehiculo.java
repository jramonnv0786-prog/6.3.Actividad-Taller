import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    
    protected String matricula;
    protected String modelo;
    // Composición: Las reparaciones se guardan aquí (vínculo fuerte)
    protected List<Reparacion> historial;

    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.historial = new ArrayList<>();
    }
}

