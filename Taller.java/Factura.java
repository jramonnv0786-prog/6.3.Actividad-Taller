import java.util.Date;

public class Factura {
    private String numeroFactura;
    private double importeTotal;
    private Date fechaEmision;
    private Reparacion reparacionAsociada; // Relación con Reparación

    public Factura(String numeroFactura, Reparacion reparacion) {
        this.numeroFactura = numeroFactura;
        this.reparacionAsociada = reparacion;
        this.fechaEmision = new Date();
        // El importe vendría del coste de la reparación (asumiendo un getter)
        // this.importeTotal = reparacion.getCoste() * 1.21; // Ejemplo con IVA
    }

    public void imprimirFactura() {
        System.out.println("Factura: " + numeroFactura + " | Fecha: " + fechaEmision);
    }
}