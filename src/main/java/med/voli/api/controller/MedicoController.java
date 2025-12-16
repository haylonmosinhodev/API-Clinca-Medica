package med.voli.api.controller;

import jakarta.validation.Valid;
import med.voli.api.endereco.Endereco;
import med.voli.api.medico.DadosCadastroMedico;
import med.voli.api.medico.Medico;
import med.voli.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
}
