package alanryan.vollmed.api.medico;

import alanryan.vollmed.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
