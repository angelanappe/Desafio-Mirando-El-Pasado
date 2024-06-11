import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        //1.-
        ArrayList<String> marcas = new ArrayList<>();

        //2.-
        marcas.add("Kodak");
        marcas.add("Nokia");
        marcas.add("FoxKids");
        marcas.add("Blackberry");
        marcas.add("Polaroid");
        marcas.add("Fotolog");
        marcas.add("Sega");
        marcas.add("Palm");
        marcas.add("MySpace");
        marcas.add("Napster");
        System.out.println("1.Listado de marcas versión 1: ");
        System.out.println(marcas);

        //3.-
        marcas.add("Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");
        System.out.println("2.Listado de marcas versión 2:");
        System.out.println(marcas);

        //4.-
        int blokbaster = marcas.indexOf("Blokbaster");
        if (blokbaster != -1) {
            marcas.set(blokbaster, "Blockbuster");
        }
        System.out.println("3.Listado de marcas sin errores ortográficos: ");
        System.out.println(marcas);

        //5.-
        marcas.remove("Carrefour");
        System.out.println("4.Listado sin 'Carrefour': ");
        System.out.println(marcas);

        // 6.-
        ArrayList<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("Super Nintendo");
        posiblesMarcas.add("Nintendo64");
        posiblesMarcas.add("Lada");

        // 7.-
        System.out.println("5.La cantidad de elementos en la lista final es: ");
        System.out.println(marcas.size());
    }
}