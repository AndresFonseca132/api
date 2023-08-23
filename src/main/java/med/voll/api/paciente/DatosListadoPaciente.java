package med.voll.api.paciente;


public record DatosListadoPaciente(Long id, String nombre, String documento, String email, String telefono) {

    public DatosListadoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNombre(), paciente.getDocumento(), paciente.getEmail(), paciente.getTelefono());
    }

}
