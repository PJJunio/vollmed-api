package med.voll.api.medico;

public record ListagemMedicoDto(String nome, String email, String crm, Especialidade especialidade) {

    public ListagemMedicoDto(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
