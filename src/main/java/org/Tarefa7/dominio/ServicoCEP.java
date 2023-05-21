package org.Tarefa7.dominio;


import org.Tarefa7.persistencia.ConsultaViaCEP;
import org.Tarefa7.persistencia.MontaPesquisaCEP;
import org.Tarefa7.persistencia.ResultadoPesquisaCEP;
import org.springframework.stereotype.Service;

@Service
public class ServicoCEP {
    // Retorna a cidade correspondente ao CEP ou
    // "invalido" se o CEP for invalido ou
    // "nao atendida" se o CEP é válido mas a cidade não é atendida
    // "excecao" se houve problema na consulta
    public ResultadoPesquisaCEP pesquisaCEP(String umCEP) throws Exception {
        ConsultaViaCEP cvc = new ConsultaViaCEP();
        if (!umCEP.isBlank()) {
            var pesquisa = new MontaPesquisaCEP();
            pesquisa.setCep(umCEP);
            var consulta = pesquisa.consultaPorCEP();
            var resp = cvc.submeteConsultaCEP(consulta);
            return resp;

        } else {
            return null;
        }
    }
}
