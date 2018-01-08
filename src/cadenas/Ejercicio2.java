package cadenas;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilidades.Entrada;

/**
 *
 * @author bogdan
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String matricula;
        matricula = Entrada.cadena().toUpperCase();
        
        Pattern p = Pattern.compile("([0-9]{4})([[A-Z]&&[^AEIOU]]{3})");
        Matcher m = p.matcher(matricula);
        if(m.matches())
            System.out.println("Matricula correcta: "+m.group(1)+" "+m.group(2));
        else
            System.out.println("Matricula incorrecta.");
    }   
}
