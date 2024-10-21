package org.example;

public class CarroF1 {
    private String motor;
    private String pneus;
    private String aerodinamica;


    private CarroF1(Builder builder) {
        this.motor = builder.motor;
        this.pneus = builder.pneus;
        this.aerodinamica = builder.aerodinamica;
    }

    @Override
    public String toString() {
        return "CarroF1 [Motor=" + motor + ", Pneus=" + pneus + ", Aerodinâmica=" + aerodinamica + "]";
    }


    public static class Builder {
        private String motor;
        private String pneus;
        private String aerodinamica;

        public Builder setMotor(String motor) {
            this.motor = motor;
            return this;
        }

        public Builder setPneus(String pneus) {
            this.pneus = pneus;
            return this;
        }

        public Builder setAerodinamica(String aerodinamica) {
            this.aerodinamica = aerodinamica;
            return this;
        }

        public CarroF1 build() {
            return new CarroF1(this);
        }
    }
}
