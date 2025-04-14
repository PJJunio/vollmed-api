package med.voll.api.paciente;

public record ListagemPacientesDto(String nome, String email, String telefone, String cpf) {

    public ListagemPacientesDto(Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf());
    }
}
