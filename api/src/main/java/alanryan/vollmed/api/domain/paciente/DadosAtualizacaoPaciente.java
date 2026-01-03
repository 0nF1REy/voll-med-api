package alanryan.vollmed.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import alanryan.vollmed.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
