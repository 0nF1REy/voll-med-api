package alanryan.vollmed.api.medico;

import jakarta.validation.constraints.NotNull;
import alanryan.vollmed.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
