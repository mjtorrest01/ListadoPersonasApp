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
            try {
                salir = ejecutarOperacion(consola, personas);
            } catch (Exception e){
                System.out.println("____________________________________________________");
                System.out.println("***** Ocurrio un Error: " + e.getMessage() + " *****");
                System.out.println("____________________________________________________");
            }

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

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        //REVISAR LA OPCION SELECCIONADA
        switch (opcion){

            case 1 -> { //AGREGAR PERSONA A LA LISTA -VARIABLE TEMPORAL
                System.out.print("Proporcione el Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporcione el Telefono: ");
                var tel = consola.nextLine();
                System.out.print("Proporcione el Email: ");
                var email = consola.nextLine();
                // CREAR EL OBJETO PERSONA -VARIABLE TEMPORAL
                var persona = new Persona(nombre, tel, email);
                //LO AGREGAMOS A LA LISTA
                personas.add(persona);
                System.out.println("_____________________________________________________");
                System.out.println("***** La Lista Tiene: " + personas.size() + " Elementos *****");
                System.out.println("_____________________________________________________");
            } // FIN DE CASO 1

            case 2 -> { // LISTAR LAS PERSONAS
                System.out.println();
                System.out.println("Listado de Personas: ");
                // MEJORA USANDO LAMBDA Y METODO DE REFERENCIA
                //personas.forEach((persona) -> System.out.println(persona)); <-- METODO LAMBDA
                System.out.println("____________________________________________________________________________________");
                personas.forEach(System.out::println); // <-- METODO DE REFERENCIA
                System.out.println("____________________________________________________________________________________");
            } // FIN DE CASO 2

            case 3 -> { // SALIMOS DE CICLO
                System.out.println("___________________________");
                System.out.println("***** Hasta Pronto... *****");
                System.out.println("___________________________");
                salir = true;
            } //FIN DE CASO 3

            default -> {
                    System.out.println("___________________________________");
                    System.out.println("***** Opcion Erronea " + opcion + " *****");
                    System.out.println("___________________________________");
            }
        } // FIN DE SWITCH
        return salir;

    }

} // FIN DE CLASS