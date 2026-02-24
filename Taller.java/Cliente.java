import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String dni;
    // Agregación: El cliente tiene vehículos, pero estos existen fuera de él
    private List<Vehiculo> misVehiculos;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.misVehiculos = new ArrayList<>();
    }
    
    public void comprarVehiculo(Vehiculo v) {
        misVehiculos.add(v);
    }
}
