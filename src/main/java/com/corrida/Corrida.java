package com.corrida;
import java.util.List;
import java.util.ArrayList;


public class Corrida {
    private List<Observador> observadores = new ArrayList<>();
    private int posicao;
    private String piloto;

    public void adicionarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void removerObservador(Observador obs) {
        observadores.remove(obs);
    }

    public void mudarPosicao(int novaPosicao, String piloto) {
        this.posicao = novaPosicao;
        this.piloto = piloto;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador obs : observadores) {
            obs.atualizar(posicao, piloto);
        }
    }
}
