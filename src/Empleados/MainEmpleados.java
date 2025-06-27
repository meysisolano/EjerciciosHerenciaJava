package Empleados;

public class MainEmpleados {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Carlos Pérez", 1001, 1500);
        Empleado emp2 = new Empleado("María López", 1002, 1600);
        Empleado emp3 = new Empleado("Luis Rodríguez", 1003, 1700);

        Gerente ger1 = new Gerente("Meysi Solano", 2001, 2500, 500);
        Gerente ger2 = new Gerente("Erick Cajina", 2002, 2800, 800);

        System.out.println("=== Datos de Empleados ===");
        emp1.mostrarDatos();
        System.out.println();
        emp2.mostrarDatos();
        System.out.println();
        emp3.mostrarDatos();
        System.out.println();

        System.out.println("=== Datos de Gerentes ===");
        ger1.mostrarDatos();
        System.out.println();
        ger2.mostrarDatos();
    }
}
