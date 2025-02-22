package Taller3ModificadordeAccesoPaquete.Ejercicios;

public class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
}

class ClaseDePrueba {
    public static void main(String[] args) {
        Producto miProducto = new Producto("Camiseta", 25.0, 100);
        miProducto.mostrarInfo();
    }
}
