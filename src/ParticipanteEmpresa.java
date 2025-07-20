public class ParticipanteEmpresa extends Participante{
    // Atributos propios de esta subclase.
    private String tipoEmpresa; // pública o privada
    private String nombreEmpresa;
    //Constructor de ParticipanteEmpresa.
    //Llama al constructor de la clase base y establece "Empresa" como tipoEntidad.
    public ParticipanteEmpresa(String nombre, int edad, String genero, boolean buenaSalud, String tipoEmpresa, String nombreEmpresa) {
        super(nombre, edad, genero, buenaSalud, "Empresa " + tipoEmpresa);
        this.tipoEmpresa = tipoEmpresa;
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " - Empresa " + tipoEmpresa + ": " + nombreEmpresa;
    }
}
