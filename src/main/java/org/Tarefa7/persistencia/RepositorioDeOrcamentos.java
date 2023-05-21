package org.Tarefa7.persistencia;


import org.Tarefa7.dominio.Orcamento;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioDeOrcamentos implements IRepositorioDeOrcamentos{

    private ArrayList<Orcamento> orcamentos = new ArrayList<>();

    public RepositorioDeOrcamentos() {
        this.orcamentos = new ArrayList<>();
    }

    @Override
    public void cadastra(Orcamento orcamento) {
        orcamentos.add(orcamento);
    }

    @Override
    public List<Orcamento> deUmaData(int dia,int mes,int ano) {
        return null;
    }
}
