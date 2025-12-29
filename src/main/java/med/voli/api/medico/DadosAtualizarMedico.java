package med.voli.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voli.api.endereco.DadosEndereco;
import med.voli.api.endereco.Endereco;

public record DadosAtualizarMedico(
        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco) {

}
