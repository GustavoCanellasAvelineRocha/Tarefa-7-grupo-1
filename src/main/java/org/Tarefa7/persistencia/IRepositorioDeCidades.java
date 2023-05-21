package org.Tarefa7.persistencia;



import org.Tarefa7.dominio.Cidade;

import java.util.List;

public interface IRepositorioDeCidades {
    List<Cidade> todas();
    Cidade get(long id);
    Cidade get(String nome); }
