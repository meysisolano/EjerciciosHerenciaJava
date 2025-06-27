package Ejercicio1;

public class Motocicleta extends Vehiculo {
    boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}