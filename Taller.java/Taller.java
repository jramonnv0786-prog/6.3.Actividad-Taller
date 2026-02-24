public class Taller {
    
    // Dependencia: Recibe Vehiculo y Mecanico como parámetros puntuales
    public void asignarReparacion(Vehiculo v, Mecanico m) {
        System.out.println("Asignando reparación para vehículo: " + v.matricula);
        m.reparar();
        
        // Creamos la reparación y la añadimos al historial (vínculo fuerte)
        Reparacion nueva = new Reparacion("Reparación general", 150.0);
        v.historial.add(nueva);
    }
}
