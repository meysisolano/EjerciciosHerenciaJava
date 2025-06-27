package Ejercicio1;

public class Auto extends Vehiculo {
    int numeroPuertas;

    public Auto(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}
