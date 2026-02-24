public class Principal {
public static void main(String[] args) {
        // 1. Creamos al personal del taller
        Taller miTaller = new Taller();
        Mecanico paco = new Mecanico();

        // 2. Creamos un cliente y sus vehículos
        Cliente cliente1 = new Cliente("Juan Pérez", "12345678Z");
        
        // Creamos un Coche y una Moto (Herencia)
        Coche miCoche = new Coche("1234-BBB", "Seat Ibiza", 5);
        Moto miMoto = new Moto("5678-CCC", "Yamaha MT-07", false);

        // El cliente adquiere los vehículos (Agregación)
        cliente1.comprarVehiculo(miCoche);
        cliente1.comprarVehiculo(miMoto);

        System.out.println("--- Inicio de Jornada en MerceDAWs ---");

        // 3. El taller asigna una reparación (Dependencia)
        // Pasamos el vehículo y el mecánico como parámetros
        miTaller.asignarReparacion(miCoche, paco);

        // 4. Verificamos que la reparación se guardó en el vehículo (Composición)
        System.out.println("Reparaciones registradas en el coche: " + miCoche.historial.size());
        
        System.out.println("--- Proceso finalizado con éxito ---");
    }
}        

    

