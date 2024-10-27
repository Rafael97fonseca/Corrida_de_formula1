package Estrutural;

public class Carro {
    private String idCarro;
    private double velocidadeMaxima;
    private double aceleracao;
    private Equipe equipe;

    public Carro(String idCarro, double velocidadeMaxima, double aceleracao, Equipe equipe) {
        this.idCarro = idCarro;
        this.velocidadeMaxima = velocidadeMaxima;
        this.aceleracao = aceleracao;
        this.equipe = equipe;
    }
}
