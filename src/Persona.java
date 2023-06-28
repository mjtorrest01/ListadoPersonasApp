public class Persona {
    private int id;
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

    // GENERANDO GET Y SET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // FIN DE GET Y SET


    @Override // // GENERANDO toString
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

} // FIN CLASS PERSONA


