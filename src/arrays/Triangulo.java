package arrays;

/**
 *
 * @author bogdan
 */
public class Triangulo {

    private Punto verticeA = new Punto();
    private Punto verticeB = new Punto();
    private Punto verticeC = new Punto();

    public Triangulo() {

    }

    public Triangulo(Punto verticeA, Punto verticeB, Punto verticeC) {
        this.verticeA = verticeA;
        this.verticeB = verticeB;
        this.verticeC = verticeC;
    }

    public Punto getVerticeA() {
        return verticeA;
    }

    public Punto getVerticeB() {
        return verticeB;
    }

    public Punto getVerticeC() {
        return verticeC;
    }

    public double perimetro() {
        double AB, BC, CA, perimetro;
        AB = verticeA.distancia(verticeB);
        BC = verticeB.distancia(verticeC);
        CA = verticeC.distancia(verticeA);
        perimetro = AB + BC + CA;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Triangulo A=" + verticeA + " B=" + verticeB + " C=" + verticeC;
    }

}
