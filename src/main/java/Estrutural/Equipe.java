package Estrutural;

public class Equipe {
    private String nomeEquipe;
    private Carro carro;
    private Piloto piloto;

    public Equipe(String nomeEquipe, Carro carro, Piloto piloto) {
        this.nomeEquipe = nomeEquipe;
        this.carro = carro;
        this.piloto = piloto;
    }
}
