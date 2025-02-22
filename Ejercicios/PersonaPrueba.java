package Taller3ModificadordeAccesoPaquete.Ejercicios;

public class PersonaPrueba {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona();

        // Acceder a 'nombre' a través del setter y getter
        persona.setNombre("Juan Pérez");
        System.out.println("Nombre: " + persona.getNombre());

        // Acceder y modificar 'edad' directamente (accesible por ser de paquete)
        persona.edad = 30;
        System.out.println("Edad: " + persona.edad);

        // Intentamos acceder directamente a 'nombre' (esto no es permitido)
        // persona.nombre = "Pedro";  // Esto causaría un error de compilación porque 'nombre' es private

        // Intentamos acceder directamente a 'edad' (esto es permitido)// No hay error porque 'edad' es accesible dentro del mismo paquete
    }
       // DISCUCION
/* private: Es como tener un secreto muy bien guardado. Solo tú (la clase) puedes acceder a él.
Acceso de paquete (sin modificador): Es como compartir algo con tus vecinos (las clases en el mismo paquete).
 Ellos pueden usarlo, pero los que viven en otros barrios (otros paquetes) no pueden */

    
}


