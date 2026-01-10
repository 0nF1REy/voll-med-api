package alanryan.vollmed.api.domain.consulta.validacoes.cancelamento;

import alanryan.vollmed.api.domain.consulta.DadosCancelamentoConsulta;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamentoConsulta dados);

}
