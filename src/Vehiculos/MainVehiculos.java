package Vehiculos;

public class MainVehiculos {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "Corolla", 2020, 4);
        Auto auto2 = new Auto("Hyundai", "Elantra", 2017, 4);

        Motocicleta moto1 = new Motocicleta("Pulsar", "NS200", 2022, false);
        Motocicleta moto2 = new Motocicleta("Yamaha", "FZ25", 2021, false);

        Camion camion1 = new Camion("Isuzu", "FTR 850", 2019, 15);
        Camion camion2 = new Camion("Hino", "500 Series", 2020, 18);

        Vehiculo[] vehiculos = { auto1, auto2, moto1, moto2, camion1, camion2 };

        for (Vehiculo v : vehiculos) {
            v.mostrarDatos();
            v.arrancar();
            System.out.println();
        }
    }
}
