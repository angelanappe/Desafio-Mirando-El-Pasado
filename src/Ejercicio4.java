import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {
    public static void main(String[] args) {
        //1.-
        Queue<String> juegos = new LinkedList<>();

        //2.-
        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");
        juegos.add("Pillarse");
        System.out.println("Listado de juegos:");
        System.out.println(juegos);

        //3.-
        System.out.println("Número de juegos en el listado:");
        System.out.println(juegos.size());
    }
}
