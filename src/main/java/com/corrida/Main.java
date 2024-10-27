package com.corrida;

public class Main {
    public static void main(String[] args) {
        Corrida corrida = new Corrida();

        PainelAtualizacao painel = new PainelAtualizacao();
        Estatisticas estatisticas = new Estatisticas();
        TransmissaoAoVivo transmissao = new TransmissaoAoVivo();

        corrida.adicionarObservador(painel);
        corrida.adicionarObservador(estatisticas);
        corrida.adicionarObservador(transmissao);


        corrida.mudarPosicao(1, "Hamilton");
        corrida.mudarPosicao(2, "Verstappen");
    }
}
