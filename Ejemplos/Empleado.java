package Taller3ModificadordeAccesoPaquete.Ejemplos;

class Empleado { // Clase con miembros de paquete (default)
    String nombre;
    double salario;
    
    Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}
