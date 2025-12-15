package med.voli.api.controller;


import med.voli.api.paciente.DadosCasdastroPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCasdastroPaciente dados){
        System.out.println(dados);
    }
}
