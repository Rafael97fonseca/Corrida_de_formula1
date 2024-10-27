package Estrutural;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Piloto piloto1 = new Piloto("Hamilton", 35, 9.5);
        Piloto piloto2 = new Piloto("Verstappen", 23, 9.7);


        Carro carro1 = new Carro("Mercedes01", 350, 3.5, null);
        Carro carro2 = new Carro("RedBull01", 340, 3.6, null);


        Equipe equipe1 = new Equipe("Mercedes", carro1, piloto1);
        Equipe equipe2 = new Equipe("Red Bull", carro2, piloto2);


        List<Equipe> equipes = new ArrayList<>();
        equipes.add(equipe1);
        equipes.add(equipe2);


        CorridaDeFormula1 corrida = new CorridaDeFormula1(equipes);
        corrida.iniciarCorrida();
        corrida.calcularVencedor();
        corrida.finalizarCorrida();
    }
}
