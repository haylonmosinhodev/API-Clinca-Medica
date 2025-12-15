package med.voli.api.paciente;

import med.voli.api.endereco.DadosEndereco;
import med.voli.api.endereco.Endereco;


public record DadosCasdastroPaciente(String nome, String email, String telefone, String cpf, Endereco endereco) {
}
