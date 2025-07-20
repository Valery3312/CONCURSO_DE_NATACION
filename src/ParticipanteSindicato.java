public class ParticipanteSindicato extends Participante{
    private String tipoSindicato;

    public ParticipanteSindicato(String nombre, int edad, String genero, boolean buenaSalud, String tipoSindicato) {
        super(nombre, edad, genero, buenaSalud, "Sindicato");
        this.tipoSindicato = tipoSindicato;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " - Sindicato: " + tipoSindicato;
    }
}
