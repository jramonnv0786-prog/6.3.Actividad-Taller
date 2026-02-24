public class Mecanico implements Especialista {
    @Override
    public void reparar() {
        System.out.println("Mecánico reparando según el protocolo de Especialista.");
    }
}
