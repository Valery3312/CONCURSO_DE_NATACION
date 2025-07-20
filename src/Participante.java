//CLASE BASE//
public class Participante {
//Declaración de atributos protegidos (visibles en clases hijas)
    protected String nombre;
    protected int edad;
    protected String genero;
    protected boolean buenaSalud;
    protected String tipoEntidad;

    // Constructor de la clase Participante: inicializa todos los atributos

    public Participante(String nombre, int edad, String genero, boolean buenaSalud, String tipoEntidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.buenaSalud = buenaSalud;
        this.tipoEntidad = tipoEntidad;
    }
    // Método que evalúa si el participante cumple las condiciones para participar
    public boolean puedeParticipar() {
    // Devuelve true solo si la edad está entre 18 y 25 (inclusive) y si está en buena salud
        return edad >= 18 && edad <= 25 && buenaSalud;
    }
    // Método que devuelve una cadena con información general del participante
    public String getInfo() {
        // Devuelve el nombre, edad, género y estado de salud como texto
        return nombre + " - " + edad + " años - " + genero + " - Salud: " + (buenaSalud ? "Buena" : "No apta");
        // Operador ternario: si buenaSalud es true, muestra "Buena", de lo contrario "No apta"
    }
}
