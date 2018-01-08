package arrays;

import utilidades.Entrada;

/**
 *
 * @author bogdan
 */
public class Principal {

    public static void main(String[] args) {
        int numTriangulos, cont = 0, encima = 0, debajo = 0;
        double acu = 0.0, perimetroMedio = 0, mayor = 0, menor = Double.MAX_VALUE;

        System.out.println("Introduce el numero de triangulos: ");
        numTriangulos = Entrada.entero();
        Triangulo[] arrayT = new Triangulo[numTriangulos];
        
        //para luego calcular cuantos perímetros hay por encima y por debajo de la media
        double[] perimetro = new double[numTriangulos];
        
        
        for (int i = 0; i < arrayT.length; i++) {
            Punto verticeA = new Punto((Math.random() * 100), (Math.random() * 100));
            Punto verticeB = new Punto((Math.random() * 100), (Math.random() * 100));
            Punto verticeC = new Punto((Math.random() * 100), (Math.random() * 100));
            arrayT[i] = new Triangulo(verticeA, verticeB, verticeC);
            
            /*Almaceno cada perímetro en un array porque necesito los perímetros fuera
            del bucle for para calculas cuantos son por encima y por debajo de la media
            */
            perimetro[i] = arrayT[i].perimetro();
            
            //sumamos todos los perímetros para luego hacer la media
            acu += arrayT[i].perimetro();
            cont++;
            
            //sacamos el perímetro mayor
            if (mayor < arrayT[i].perimetro()) {
                mayor = arrayT[i].perimetro();
            }
            //sacamos el perimetro menor
            if (menor > arrayT[i].perimetro()) {
                menor = arrayT[i].perimetro();
            }

        }

        perimetroMedio = (double) (acu / cont);
        
        //un for que calcula los perímetros por encima y debajo de la media
        for (int j = 0; j < perimetro.length; j++) {
            if (perimetroMedio <= perimetro[j]) {
                encima++;
            } else {
                debajo++;
            }
        }
        System.out.println("El perímetro medio es: " + perimetroMedio);
        System.out.println("Perímetro mayor: " + mayor);
        System.out.println("Perímetro menor: " + menor);
        System.out.println("Hay " + encima + " perímetros iguales o por encima de la media.");
        System.out.println("Hay " + debajo + " perímetros por debajo de la media.");

    }
}
