public class Persona {
    int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    // CONSTRUCTOR VACIO
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    // CONSTRUCTOR CON ARGUMENTOS

    public Persona(String nombre, String tel, String email) {
        this(); //  <--- SE LLAMA AL CONSTRUCTOR VACIO
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }
} // FIN CLASS PERSONA


