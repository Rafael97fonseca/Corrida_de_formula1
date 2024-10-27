package com.corrida;

public class TransmissaoAoVivo implements Observador{
    @Override
    public void atualizar(int posicao, String piloto) {
        System.out.println("Transmissão: O piloto " + piloto + " ocupa agora a posição " + posicao);
    }
}
