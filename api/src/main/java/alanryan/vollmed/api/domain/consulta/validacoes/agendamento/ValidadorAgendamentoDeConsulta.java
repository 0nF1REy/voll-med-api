package alanryan.vollmed.api.domain.consulta.validacoes.agendamento;

import alanryan.vollmed.api.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {

    void validar(DadosAgendamentoConsulta dados);
}
