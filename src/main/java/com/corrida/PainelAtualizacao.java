package com.corrida;

public class PainelAtualizacao implements Observador{
    @Override
    public void atualizar(int posicao, String piloto) {
        System.out.println("Painel: O piloto " + piloto + " agora está na posição " + posicao);
    }
}
