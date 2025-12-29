package med.voli.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import med.voli.api.endereco.DadosEndereco;

public record DadosAtualizarPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,

        @Valid DadosEndereco endereco) {
}
