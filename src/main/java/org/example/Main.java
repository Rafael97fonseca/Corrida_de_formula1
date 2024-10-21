package org.example;

public class Main {
    public static void main(String[] args) {
        CarroF1 carro = new CarroF1.Builder()
                .setMotor("Motor V6 Turbo")
                .setPneus("Pneus Pirelli")
                .setAerodinamica("Pacote de alta pressão aerodinâmica")
                .build();

        System.out.println(carro);


        DiretorCorrida diretor = DiretorCorrida.getInstancia();
        diretor.iniciarCorrida();
        diretor.encerrarCorrida();
    }
}