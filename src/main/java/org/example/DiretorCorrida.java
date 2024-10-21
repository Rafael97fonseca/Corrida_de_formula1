package org.example;

public class DiretorCorrida {
    private static DiretorCorrida instanciaUnica;


    private DiretorCorrida() {
        System.out.println("Diretor de Corrida nomeado.");
    }


    public static DiretorCorrida getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new DiretorCorrida();
        }
        return instanciaUnica;
    }

    public void iniciarCorrida() {
        System.out.println("A corrida começou!");
    }

    public void encerrarCorrida() {
        System.out.println("A corrida terminou!");
    }
}
