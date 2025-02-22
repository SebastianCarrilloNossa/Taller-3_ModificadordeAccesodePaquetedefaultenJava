package Taller3ModificadordeAccesoPaquete.Ejercicios;

public class Persona {
    private String nombre;  // Atributo privado
    int edad;               // Atributo de paquete (sin modificador de acceso)

    // Método get para 'nombre'
    public String getNombre() {
        return nombre;
    }

    // Método set para 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método get para 'edad' (opcional)
    public int getEdad() {
        return edad;
    }

    // Método set para 'edad' (opcional)
    public void setEdad(int edad){
        this.edad=edad;
    }
}
