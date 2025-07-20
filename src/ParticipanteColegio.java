//SUBCLASE PARTICIPANTECOLEGIO
// SUBCLASE PARTICIPANTECOLEGIO
// Representa a un participante que proviene de un colegio.
// Hereda los atributos y comportamientos básicos de la clase Participante
// (nombre, edad, género, buenaSalud, tipoEntidad) y agrega un atributo propio: nombreColegio.
public class ParticipanteColegio extends Participante{
    private String nombreColegio;

    //Constructor de ParticipanteColegio.
    //El constructor llama primero al constructor de la superclase (Participante) usando super(...),
    //* pasando además el literal "Colegio" para el campo tipoEntidad definido en la superclase.
    //* Luego inicializa el atributo propio nombreColegio.
    public ParticipanteColegio(String nombre, int edad, String genero, boolean buenaSalud, String nombreColegio) {
        super(nombre, edad, genero, buenaSalud, "Colegio"); // Inicializa los campos heredados y fija tipoEntidad = "Colegio".
        this.nombreColegio = nombreColegio;   // Guarda el dato específico de la subclase.
    }
    //Sobrescribe getInfo() para ampliar la información mostrada.
     //* Llama a super.getInfo() (que devuelve los datos base del participante)
     //* y agrega el nombre del colegio.

    @Override
    public String getInfo() {
        return super.getInfo() + " - Colegio: " + nombreColegio;
    }
}


