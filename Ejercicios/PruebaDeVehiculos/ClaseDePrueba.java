package Taller3ModificadordeAccesoPaquete.Ejercicios.PruebaDeVehiculos;

import vehiculos.Moto;
import vehiculos.Vehiculo;

public class ClaseDePrueba {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        // Error de compilación: tipo no es visible
        // miVehiculo.tipo = "Automovil"; 

        Moto miMoto = new Moto();
        // Error de compilación: tipo no es visible
        // miMoto.tipo = "Motocicleta";
        // Error de compilación: marca no es visible
        // miMoto.marca = "Honda";
    }
    //DISCUCION
    /* Los errores de compilación ocurren porque los miembros con acceso de paquete solo son accesibles dentro del mismo paquete. Para acceder a ellos desde otro paquete,
     necesitarías cambiar su nivel de acceso a public o usar métodos getter y setter con acceso public.*/
}

