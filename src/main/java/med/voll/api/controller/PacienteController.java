package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.paciente.DadosPaciente;
import med.voll.api.paciente.ListagemPacientesDto;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    public void cadastrarPaciente(@RequestBody @Valid DadosPaciente dadosPaciente){
        pacienteRepository.save(new Paciente(dadosPaciente));
    }

    @GetMapping
    public Page<ListagemPacientesDto> listarPacientes(@PageableDefault(size = 10, sort = {"nome"}) Pageable pageable){
        return pacienteRepository.findAll(pageable).map(ListagemPacientesDto::new);
    }
}
