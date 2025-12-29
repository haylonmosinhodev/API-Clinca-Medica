package med.voli.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voli.api.endereco.DadosEndereco;
import med.voli.api.endereco.Endereco;


public record DadosCasdastroPaciente(
        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String cpf,


        @NotNull
        @Valid
        DadosEndereco endereco) {
}
