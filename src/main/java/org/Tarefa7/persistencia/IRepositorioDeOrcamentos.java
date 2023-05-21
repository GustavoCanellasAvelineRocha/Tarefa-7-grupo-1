package org.Tarefa7.persistencia;


import org.Tarefa7.dominio.Orcamento;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IRepositorioDeOrcamentos {
    void cadastra(Orcamento orcamento);

    List<Orcamento> deUmaData(int dia, int mes, int ano);

}
