package med.voli.api.controller;

import jakarta.validation.Valid;
import med.voli.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//Trello projeto = https://trello.com/c/YwnK9c9m/1-cadastro-de-m%C3%A9dicos
//figma projeto = https://www.figma.com/design/N4CgpJqsg7gjbKuDmra3EV/Voll.med?node-id=2-1007&p=f

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional //permite uma transação ativa com o banco de dados.
    public void cadastrar(@RequestBody @Valid  DadosCadastroMedico dados){
    repository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(@PageableDefault(sort = {"nome"}) Pageable paginacao){
        return repository.findByAtivoTrue(paginacao).map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarMedico dados){
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarinformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id){
        var medico = repository.getReferenceById(id);
        medico.excluir();
    }



}
