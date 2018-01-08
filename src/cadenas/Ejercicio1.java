package cadenas;

import utilidades.Entrada;

/**
 *
 * @author bogdan
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        String cadena;
        cadena = Entrada.cadena().toLowerCase();

        //controlamos que solo se introduce una palabra
        while (cadena.contains(" ")) {
            System.out.println("Solo se puede introducir una palabra, intenta de nuevo: ");
            cadena = Entrada.cadena();
        }

        //comprobamos que la palabra introducida tiene todas las vocales
        if (cadena.contains("a") && cadena.contains("e") && cadena.contains("i") && cadena.contains("o") && cadena.contains("u")) {
            System.out.println("La palabra introducida es panvocálica.");
        } else {
            System.out.println("La palabra no es panvocálica.");
        }
    }

}
