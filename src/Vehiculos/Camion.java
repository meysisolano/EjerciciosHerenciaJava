package Vehiculos;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String marca, String modelo, int anio, double capacidadCarga) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("=== CAMIÓN ===");
        super.mostrarDatos();
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
    }

    @Override
    public void arrancar() {
        System.out.println("El camión está arrancando con motor diésel.");
    }
}
