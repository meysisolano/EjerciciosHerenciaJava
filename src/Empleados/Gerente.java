package Empleados;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, int id, double salario, double bono) {
        super(nombre, id, salario);
        this.bono = bono;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Bono: $" + bono);
        System.out.println("Salario total: $" + calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return salario + bono;
    }
}
