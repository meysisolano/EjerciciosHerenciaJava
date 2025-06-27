package Empleados;

public class Empleado {
    protected String nombre;
    protected int id;
    protected double salario;

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario: $" + salario);
    }

    public double calcularSalario() {
        return salario;
    }
}
