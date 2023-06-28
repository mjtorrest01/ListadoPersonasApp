import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        // LISTA FUERA DEL CICLO WHILE
        List<Persona> personas = new ArrayList<>();

        // Menu
        var salir = false;
        while (!salir){
            mostrarMenu();
            System.out.println();
        }
    }

    private static void mostrarMenu(){
        // MOSTRAMOS LAS OPCIONES DEL MENU
        System.out.print("""
                **** Listado Personas App ****
                1. Agregar
                2. Lista
                3. Salir
                """);
        System.out.print("Proporciona una Opcion: ");
    }

} // FIN DE CLASS