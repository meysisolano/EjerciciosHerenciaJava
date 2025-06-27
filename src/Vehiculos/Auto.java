package Vehiculos;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int anio, int cantidadPuertas) {
        super(marca, modelo, anio);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("=== AUTO ===");
        super.mostrarDatos();
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }

    @Override
    public void arrancar() {
        System.out.println("El auto está arrancando suavemente.");
    }
}
