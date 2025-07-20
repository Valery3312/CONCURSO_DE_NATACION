//SUBCLASE PARTICIPANTE_UNIVERSIDAD
public class ParticipanteUniversidad extends Participante{
    // Atributo específico para almacenar el nombre de la universidad.
    private String nombreUniversidad;
//Constructor de ParticipanteUniversidad.

        //Llama al constructor de la clase base (Participante) y fija "Universidad" como tipoEntidad.

    public ParticipanteUniversidad(String nombre, int edad, String genero, boolean buenaSalud, String nombreUniversidad) {
        super(nombre, edad, genero, buenaSalud, "Universidad");
        this.nombreUniversidad = nombreUniversidad;
    }
    //Devuelve información extendida del participante, incluyendo el nombre de la universidad.
    @Override
    public String getInfo() {
        return super.getInfo() + " - Universidad: " + nombreUniversidad;
    }
}
