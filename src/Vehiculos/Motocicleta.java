package Vehiculos;

public class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("=== MOTOCICLETA ===");
        super.mostrarDatos();
        System.out.println("¿Tiene sidecar?: " + (tieneSidecar ? "Sí" : "No"));
    }

    @Override
    public void arrancar() {
        System.out.println("La motocicleta está arrancando con fuerza.");
    }
}
