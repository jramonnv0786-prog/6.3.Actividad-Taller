import java.util.Date;
public class Reparacion {
    private Date fecha;
    private String descripcion;
    private double coste;

    public Reparacion(String descripcion, double coste) {
        this.fecha = new Date();
        this.descripcion = descripcion;
        this.coste = coste;
    }
}