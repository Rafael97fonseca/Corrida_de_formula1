package Estrutural;
import java.util.List;

public class CorridaDeFormula1 implements Corrida{
    private List<Equipe> equipes;

    public CorridaDeFormula1(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    @Override
    public void iniciarCorrida() {
        System.out.println("Corrida de Fórmula 1 iniciada!");

    }

    @Override
    public void finalizarCorrida() {
        System.out.println("Corrida finalizada.");

    }

    @Override
    public void calcularVencedor() {

    }
}
