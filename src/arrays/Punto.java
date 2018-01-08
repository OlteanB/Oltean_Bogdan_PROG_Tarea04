package arrays;

/**
 *
 * @author bogdan
 */
public class Punto {

    private double x, y;

    public Punto() {

    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punto X=" + x + " Y=" + y;
    }

    public double distancia(Punto punto) {
        double A = x - punto.getX();
        double B = y - punto.getY();
        double distancia = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        return distancia;
    }

}
