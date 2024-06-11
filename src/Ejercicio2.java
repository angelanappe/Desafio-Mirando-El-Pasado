import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {
    public static void main(String[] args) {
        //1.-
        Set<String> invitados = new TreeSet<>();

        //2.-
        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");
        System.out.println("1.Listado de invitados inicial: ");
        System.out.println(invitados);

        // 3.-
        Set<String> posiblesInvitados = new TreeSet<>();
        posiblesInvitados.add("Jorge");
        posiblesInvitados.add("Francisco");
        posiblesInvitados.add("Marcos");

        invitados.addAll(posiblesInvitados);
        System.out.println("2.Listado con posibles invitados: ");
        System.out.println(invitados);

        //4.-
        invitados.remove("Jorge");
        System.out.println("3.Listado sin 'Jorge':");
        System.out.println(invitados);
    }
}
