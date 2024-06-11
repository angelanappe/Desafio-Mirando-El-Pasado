import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {
    public static void main(String[] args) {
        //1.-
        Map<String, Integer> golosinas = new TreeMap<>();

        //2.-
        golosinas.put("Chocman", 100);
        golosinas.put("Trululú", 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-miti", 30);
        golosinas.put("Traga Traga", 150);
        golosinas.put("Tabletón", 5);
        System.out.println("Listado de golosinas inicial:");
        System.out.println(golosinas);

        //3.-
        System.out.println("Golosinas que costaban menos de 100 pesos:");
        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            if (entry.getValue() < 100) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " pesos");
            }
        }
    }
}

