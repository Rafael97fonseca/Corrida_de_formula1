package com.corrida;

public class Estatisticas implements Observador{
    @Override
    public void atualizar(int posicao, String piloto) {
        System.out.println("Estatísticas: Atualizando posição do piloto " + piloto + " para " + posicao);
    }
}
