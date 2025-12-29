package med.voli.api.controller;


import jakarta.validation.Valid;
import med.voli.api.paciente.DadosCasdastroPaciente;
import med.voli.api.paciente.DadosListagemPaciente;
import med.voli.api.paciente.Paciente;
import med.voli.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


//Trello projeto = https://trello.com/c/YwnK9c9m/1-cadastro-de-m%C3%A9dicos
//figma projeto = https://www.figma.com/design/N4CgpJqsg7gjbKuDmra3EV/Voll.med?node-id=2-1007&p=f

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired    //indica pro spring que spring que vai estanciar - Injenção de dependencias.
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCasdastroPaciente dados){
        repository.save(new Paciente(dados));

    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(@PageableDefault(sort = {"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }

    @DeleteMapping
    @Transactional
    public void excluir
}
